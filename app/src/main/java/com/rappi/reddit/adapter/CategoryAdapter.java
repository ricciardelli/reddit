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
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rappi.reddit.R;
import com.rappi.reddit.activity.RedditActivity;
import com.rappi.reddit.model.Category;
import com.rappi.reddit.util.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Base class which provides access to categories data set.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<Category> categories;
    private Context context;

    /**
     * Provide a reference to the views for each data item.
     *
     * @author Richard Ricciardelli
     * @version 1.0
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.subtitle)
        TextView subtitle;
        @BindView(R.id.subscribers)
        TextView subscribers;
        @BindView(R.id.icon)
        CircleImageView icon;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public CategoryAdapter(List<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.category_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Category category = categories.get(position);

        holder.title.setText(category.getDisplayName());
        holder.subtitle.setText(category.getPublicDescription());

        String subscribers = category.getSubscribers() > 1000 ?
                String.valueOf(category.getSubscribers() / 1000) + "K" :
                String.valueOf(category.getSubscribers());

        holder.subscribers.setText(subscribers);

        if (category.getIconImg() != null && !category.getIconImg().isEmpty()) {
            Picasso.with(context).load(category.getIconImg()).noFade().into(holder.icon);
        }

        if (!category.getKeyColor().isEmpty()) {
            holder.icon.setBorderColor(Color.parseColor(category.getKeyColor()));
        }

        final String url = category.getUrl().substring(1, category.getUrl().length() - 1);
        final String key = category.getName();

        CardView cardView = (CardView) holder.itemView.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RedditActivity.class);
                intent.putExtra(Constants.CATEGORY_URL, url);
                intent.putExtra(Constants.SUBREDDIT_ID_KEY, key);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
