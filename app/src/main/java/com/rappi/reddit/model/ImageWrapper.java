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

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Base class for image wrapper.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class ImageWrapper extends RealmObject {

    private String id;
    private Image source;
    private RealmList<Image> resolutions;
    //private List<Image> variants;

    public ImageWrapper() {
    }

    public ImageWrapper(String id, Image source, RealmList<Image> resolutions) {
        this.id = id;
        this.source = source;
        this.resolutions = resolutions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getSource() {
        return source;
    }

    public void setSource(Image source) {
        this.source = source;
    }

    public RealmList<Image> getResolutions() {
        return resolutions;
    }

    public void setResolutions(RealmList<Image> resolutions) {
        this.resolutions = resolutions;
    }

    @Override
    public String toString() {
        return "ImageWrapper{" +
                "id='" + id + '\'' +
                ", source=" + source +
                ", resolutions=" + resolutions +
                '}';
    }
}
