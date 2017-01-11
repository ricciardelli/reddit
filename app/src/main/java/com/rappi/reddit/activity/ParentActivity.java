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

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import io.realm.Realm;
import pub.devrel.easypermissions.EasyPermissions;

/**
 * Base class to define common code shared over depending activities.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class ParentActivity extends AppCompatActivity {

    protected String LOG_TAG = getClass().getSimpleName();

    private Realm mRealm = Realm.getDefaultInstance();

    /**
     * Saves items into the database.
     *
     * @param items Categories, Reddits
     */
    protected void save(List items) {
        mRealm.beginTransaction();
        mRealm.copyToRealmOrUpdate(items);
        mRealm.commitTransaction();
    }

    /**
     * Finds items from the database.
     *
     * @param object Realm object class
     * @return Categories, Reddits
     */
    protected List load(Class object) {
        return mRealm.where(object).findAll();
    }

    /**
     * Finds items from the database specifying a column and a value to search.
     *
     * @param object Realm object class
     * @param key    Column
     * @param value  Search term
     * @return Categories or Reddits filtered
     */
    protected List load(Class object, String key, String value) {
        return mRealm.where(object)
                .beginGroup()
                .equalTo(key, value)
                .endGroup()
                .findAll();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward results to EasyPermissions
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }
}
