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

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.rappi.reddit.model.CategoryResponse;
import com.rappi.reddit.service.Service;
import com.rappi.reddit.util.Constants;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Shows splash screen.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class SplashActivity extends ParentActivity implements Callback<CategoryResponse> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Service.getInstance().getService().categories().enqueue(this);
    }

    /**
     * Starts main activity once the service has sent a succesful response.
     *
     * @param key  name
     * @param data children
     */
    private void showMainActivity(String key, Serializable data) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(key, data);
        startActivity(intent);
        finish();
    }

    /**
     * Starts main activity.
     */
    private void showMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


    @Override
    public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {
        if (response.isSuccessful()) {
            showMainActivity(Constants.CATEGORIES_KEY, response.body());
        } else {
            showMainActivity();
        }
    }

    @Override
    public void onFailure(Call<CategoryResponse> call, Throwable t) {
        Log.e(LOG_TAG, t.getMessage(), t);
        showMainActivity();
    }
}
