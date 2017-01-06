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

import android.support.v7.app.AppCompatActivity;

/**
 * Base class to define common code shared over depending activities.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class ParentActivity extends AppCompatActivity {

    protected String LOG_TAG = getClass().getSimpleName();
}
