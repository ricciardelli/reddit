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

import java.util.List;

/**
 * Base class for preview of images.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class Preview {

    private List<ImageWrapper> images;

    public Preview() {
    }

    public Preview(List<ImageWrapper> images) {
        this.images = images;
    }

    public List<ImageWrapper> getImages() {
        return images;
    }

    public void setImages(List<ImageWrapper> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Preview{" +
                "images=" + images +
                '}';
    }
}
