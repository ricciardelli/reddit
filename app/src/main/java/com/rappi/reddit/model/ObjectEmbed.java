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
 * Base class for describe embed objects.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class ObjectEmbed {

    private String providerUrl;
    private String description;
    private String title;
    private String url;
    private String authorName;
    private int height;
    private int width;
    private int thumbnailWidth;
    private String version;
    private String providerName;
    private String thumbnailUrl;
    private String type;
    private int thumbnailHeight;
    private String authorUrl;

    public ObjectEmbed() {
    }

    public ObjectEmbed(String providerUrl, String description, String title, String url, String authorName, int height, int width, int thumbnailWidth, String version, String providerName, String thumbnailUrl, String type, int thumbnailHeight, String authorUrl) {
        this.providerUrl = providerUrl;
        this.description = description;
        this.title = title;
        this.url = url;
        this.authorName = authorName;
        this.height = height;
        this.width = width;
        this.thumbnailWidth = thumbnailWidth;
        this.version = version;
        this.providerName = providerName;
        this.thumbnailUrl = thumbnailUrl;
        this.type = type;
        this.thumbnailHeight = thumbnailHeight;
        this.authorUrl = authorUrl;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    @Override
    public String toString() {
        return "ObjectEmbed{" +
                "providerUrl='" + providerUrl + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", authorName='" + authorName + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", thumbnailWidth=" + thumbnailWidth +
                ", version='" + version + '\'' +
                ", providerName='" + providerName + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", type='" + type + '\'' +
                ", thumbnailHeight=" + thumbnailHeight +
                ", authorUrl='" + authorUrl + '\'' +
                '}';
    }
}
