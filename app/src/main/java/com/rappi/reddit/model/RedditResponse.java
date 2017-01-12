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

package com.rappi.reddit.model;

/**
 * Custom response which change data type to handle {@link Reddit} data.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class RedditResponse extends DefaultResponse<Data<Child<Reddit>>> {

    public RedditResponse(String kind, Data<Child<Reddit>> data) {
        super(kind, data);
    }
}
