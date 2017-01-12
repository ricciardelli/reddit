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
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.rappi.reddit.R;
import com.rappi.reddit.adapter.CategoryAdapter;
import com.rappi.reddit.model.Category;
import com.rappi.reddit.model.CategoryResponse;
import com.rappi.reddit.model.Child;
import com.rappi.reddit.service.Service;
import com.rappi.reddit.util.Constants;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends ParentActivity implements Callback<CategoryResponse>,
        SwipeRefreshLayout.OnRefreshListener, ActivityBehaviour {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.categories)
    RecyclerView mRecyclerView;

    @BindView(R.id.activity_main_swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @BindView(R.id.activity_main_progress_bar)
    ProgressBar mProgressBar;

    private RecyclerView.LayoutManager mLayoutManager;
    private CategoryAdapter mCategoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        mSwipeRefreshLayout.setOnRefreshListener(this);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        if (getIntent().getSerializableExtra(Constants.CATEGORIES_KEY) != null) {
            CategoryResponse response = (CategoryResponse) getIntent().getSerializableExtra(Constants.CATEGORIES_KEY);
            setData(response.getData().getChildren());
        } else {
            callService();
        }

    }

    @Override
    public void callService() {
        Service.getInstance().getService().categories().enqueue(this);
    }

    @Override
    public void showError() {
        mProgressBar.setVisibility(View.GONE);
        Snackbar.make(mSwipeRefreshLayout, R.string.service_error, Snackbar.LENGTH_INDEFINITE).
                setAction(R.string.action_try_again, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mProgressBar.setVisibility(View.VISIBLE);
                        callService();
                    }
                }).show();

        // Sets adapter with offline data.
        setAdapter(load(Category.class));
    }

    @Override
    public void cancelRefreshing() {
        if (mSwipeRefreshLayout.isRefreshing()) {
            mSwipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override
    public void setAdapter(List items) {
        mCategoryAdapter = new CategoryAdapter(items, this);
        mRecyclerView.setAdapter(mCategoryAdapter);

        mCategoryAdapter.notifyDataSetChanged();

        mRecyclerView.setVisibility(View.VISIBLE);
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void setData(List children) {
        List<Category> categories = new ArrayList<>();

        for (Object category : children) {
            categories.add(((Child<Category>) category).getData());
        }

        setAdapter(categories);

        save(categories);
    }

    @Override
    public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {

        cancelRefreshing();

        if (response.isSuccessful()) {
            Log.d(LOG_TAG, "Response :: " + response.body());

            setData(response.body().getData().getChildren());
        } else {
            showError();
            Log.e(LOG_TAG, "Response failed");
        }
    }

    @Override
    public void onFailure(Call<CategoryResponse> call, Throwable t) {
        cancelRefreshing();
        showError();
        Log.e(LOG_TAG, t.getMessage(), t);
    }

    @Override
    public void onRefresh() {
        callService();
    }
}
