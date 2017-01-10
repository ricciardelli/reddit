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

import java.util.Date;
import java.util.List;

/**
 * Base class for reddit categories data.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class Category {

    private String bannerImg;
    private String id;
    private String submitText;
    private String displayName;
    private String headerImg;
    private String title;
    private List<Integer> iconSize;
    private String iconImg;
    private String headerTitle;
    private String description;
    private long subscribers;
    private String submitTextLabel;
    private String lang;
    private String keyColor;
    private String name;
    private Date created;
    private String url;
    private Date createdUtc;
    private List<Integer> bannerSize;
    private String publicDescription;
    private String subredditType;

    public Category() {
    }

    public Category(String bannerImg, String id, String submitText, String displayName, String headerImg, String title, List<Integer> iconSize, String iconImg, String headerTitle, String description, long subscribers, String submitTextLabel, String lang, String keyColor, String name, Date created, String url, Date createdUtc, List<Integer> bannerSize, String publicDescription, String subredditType) {
        this.bannerImg = bannerImg;
        this.id = id;
        this.submitText = submitText;
        this.displayName = displayName;
        this.headerImg = headerImg;
        this.title = title;
        this.iconSize = iconSize;
        this.iconImg = iconImg;
        this.headerTitle = headerTitle;
        this.description = description;
        this.subscribers = subscribers;
        this.submitTextLabel = submitTextLabel;
        this.lang = lang;
        this.keyColor = keyColor;
        this.name = name;
        this.created = created;
        this.url = url;
        this.createdUtc = createdUtc;
        this.bannerSize = bannerSize;
        this.publicDescription = publicDescription;
        this.subredditType = subredditType;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmitText() {
        return submitText;
    }

    public void setSubmitText(String submitText) {
        this.submitText = submitText;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(long subscribers) {
        this.subscribers = subscribers;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public void setSubmitTextLabel(String submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Date createdUtc) {
        this.createdUtc = createdUtc;
    }

    public List<Integer> getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(List<Integer> bannerSize) {
        this.bannerSize = bannerSize;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    @Override
    public String toString() {
        return "Category{" +
                "bannerImg='" + bannerImg + '\'' +
                ", id='" + id + '\'' +
                ", submitText='" + submitText + '\'' +
                ", displayName='" + displayName + '\'' +
                ", headerImg='" + headerImg + '\'' +
                ", title='" + title + '\'' +
                ", iconSize=" + iconSize +
                ", iconImg='" + iconImg + '\'' +
                ", headerTitle='" + headerTitle + '\'' +
                ", description='" + description + '\'' +
                ", subscribers=" + subscribers +
                ", submitTextLabel='" + submitTextLabel + '\'' +
                ", lang='" + lang + '\'' +
                ", keyColor='" + keyColor + '\'' +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", url='" + url + '\'' +
                ", createdUtc=" + createdUtc +
                ", bannerSize=" + bannerSize +
                ", publicDescription='" + publicDescription + '\'' +
                ", subredditType='" + subredditType + '\'' +
                '}';
    }
}
