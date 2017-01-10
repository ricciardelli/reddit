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

package com.rappi.reddit.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rappi.reddit.R;
import com.rappi.reddit.model.ImageWrapper;
import com.rappi.reddit.model.Reddit;
import com.rappi.reddit.util.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Base class which provides access to reddits data set.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class RedditAdapter extends RecyclerView.Adapter<RedditAdapter.ViewHolder> {

    private List<Reddit> reddits;
    private Context context;

    /**
     * Provide a reference to the views for each data item.
     *
     * @author Richard Ricciardelli
     * @version 1.0
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView createdAt;
        public TextView domain;
        public TextView comments;
        public TextView ups;
        public TextView serious;
        public ImageView preview;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            createdAt = (TextView) view.findViewById(R.id.created_at);
            domain = (TextView) view.findViewById(R.id.domain);
            comments = (TextView) view.findViewById(R.id.comments);
            ups = (TextView) view.findViewById(R.id.ups);
            serious = (TextView) view.findViewById(R.id.serious);
            preview = (ImageView) view.findViewById(R.id.preview);
        }
    }

    public RedditAdapter(List<Reddit> reddits, Context context) {
        this.reddits = reddits;
        this.context = context;
    }

    @Override
    public RedditAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.reddit_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Reddit reddit = reddits.get(position);

        holder.title.setText(reddit.getTitle());

        /*holder.createdAt.setText(DateUtils.getRelativeTimeSpanString(
                reddit.getCreated().getTime(), System.currentTimeMillis(),
                DateUtils.SECOND_IN_MILLIS, DateUtils.FORMAT_ABBREV_RELATIVE));*/

        String createdAt = context.getString(
                R.string.created_at,
                DateUtils.getRelativeTimeSpanString(
                        reddit.getCreated().getTime(),
                        System.currentTimeMillis(),
                        DateUtils.SECOND_IN_MILLIS,
                        DateUtils.FORMAT_ABBREV_RELATIVE),
                reddit.getAuthor());

        holder.createdAt.setText(createdAt);
        holder.domain.setText(reddit.getDomain());
        holder.comments.setText(String.valueOf(reddit.getNumComments()));
        holder.ups.setText(String.valueOf(reddit.getUps()));

        if (reddit.getLinkFlairCssClass() != null) {
            if (reddit.getLinkFlairCssClass().equalsIgnoreCase(Constants.SERIOUS_TAG)) {
                holder.serious.setVisibility(View.VISIBLE);
            }
        }

        if (reddit.getPreview() != null) {
            for (ImageWrapper imageWrapper : reddit.getPreview().getImages()) {
                holder.preview.setVisibility(View.VISIBLE);
                holder.title.setBackgroundResource(R.drawable.gradient);
                holder.title.setTextColor(Color.WHITE);
                Picasso.with(context).load(imageWrapper.getSource().getUrl()).into(holder.preview);
            }
        }

        final String url = reddit.getUrl();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return reddits.size();
    }
}
