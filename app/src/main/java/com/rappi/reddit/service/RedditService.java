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

package com.rappi.reddit.service;

import com.rappi.reddit.model.CategoryResponse;
import com.rappi.reddit.model.RedditResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Category service interface.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public interface RedditService {

    @GET("reddits.json")
    Call<CategoryResponse> categories();

    @GET("{url}.json")
    Call<RedditResponse> reddit(@Path("url") String url);

}
