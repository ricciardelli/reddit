/*
 * Copyright (C) 2017 Richard Ricciardelli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rappi.reddit.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.rappi.reddit.R;
import com.rappi.reddit.adapter.RedditAdapter;
import com.rappi.reddit.model.Child;
import com.rappi.reddit.model.Reddit;
import com.rappi.reddit.model.RedditResponse;
import com.rappi.reddit.service.Service;
import com.rappi.reddit.util.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RedditActivity extends ParentActivity implements Callback<RedditResponse>, SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private DividerItemDecoration mDividerItemDecoration;
    private RedditAdapter mRedditAdapter;

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);

        callService();

        mRecyclerView = (RecyclerView) findViewById(R.id.reddits);
        mProgressBar = (ProgressBar) findViewById(R.id.activity_reddit_progress_bar);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_reddit_swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mDividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                mLayoutManager.getOrientation());
        mRecyclerView.addItemDecoration(mDividerItemDecoration);
    }

    /**
     * Call service to retrieve reddits based on category URL.
     */
    private void callService() {
        String url = getIntent().getStringExtra(Constants.CATEGORY_URL);

        if (url != null) {
            Service.getInstance().getService().reddit(url).enqueue(this);
        }
    }

    @Override
    public void onResponse(Call<RedditResponse> call, Response<RedditResponse> response) {
        if (response.isSuccessful()) {
            Log.d(LOG_TAG, "Response :: " + response.body());

            if (mSwipeRefreshLayout.isRefreshing()) {
                mSwipeRefreshLayout.setRefreshing(false);
            }

            List<Reddit> reddits = new ArrayList<>();

            for (Child<Reddit> reddit : response.body().getData().getChildren()) {
                reddits.add(reddit.getData());
            }

            mRedditAdapter = new RedditAdapter(reddits, this);
            mRecyclerView.setAdapter(mRedditAdapter);

            mRedditAdapter.notifyDataSetChanged();

            mRecyclerView.setVisibility(View.VISIBLE);
            mProgressBar.setVisibility(View.GONE);
        } else {
            Log.e(LOG_TAG, "Response failed");
            // TODO Snack bar!
        }
    }

    @Override
    public void onFailure(Call<RedditResponse> call, Throwable t) {
        Log.e(LOG_TAG, t.getMessage(), t);
    }

    @Override
    public void onRefresh() {
        callService();
    }
}
