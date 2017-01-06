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
 * Base class for reddit data.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class Reddit {

    private String bannerImg;
    private boolean userSrThemeEnabled;
    private String submitTextHtml;
    private String userIsBanned;
    private boolean wikiEnabled;
    private boolean showMedia;
    private String id;
    private String submitText;
    private String displayName;
    private String headerImg;
    private String descriptionHtml;
    private String title;
    private boolean collapseDeletedComments;
    private boolean over18;
    private String publicDescriptionHtml;
    private boolean spoilersEnabled;
    private List<Integer> iconSize;
    private String suggestedCommentSort;
    private String iconImg;
    private String headerTitle;
    private String description;
    private String userIsMuted;
    private String submitLinkLabel;
    private String accountsActive;
    private boolean publicTraffic;
    private List<Integer> headerSize;
    private long subscribers;
    private String submitTextLabel;
    private String lang;
    private String userIsModerator;
    private String keyColor;
    private String name;
    private Date created;
    private String url;
    private boolean quarantine;
    private boolean hideAds;
    private Date createdUtc;
    private List<Integer> bannerSize;
    private String userIsContributor;
    private String publicDescription;
    private boolean showMediaPreview;
    private int commentScoreHideMins;
    private String subredditType;
    private String submissionType;
    private String userIsSubscriber;

    public Reddit() {
    }

    public Reddit(String bannerImg, boolean userSrThemeEnabled, String submitTextHtml, String userIsBanned, boolean wikiEnabled, boolean showMedia, String id, String submitText, String displayName, String headerImg, String descriptionHtml, String title, boolean collapseDeletedComments, boolean over18, String publicDescriptionHtml, boolean spoilersEnabled, List<Integer> iconSize, String suggestedCommentSort, String iconImg) {
        this.bannerImg = bannerImg;
        this.userSrThemeEnabled = userSrThemeEnabled;
        this.submitTextHtml = submitTextHtml;
        this.userIsBanned = userIsBanned;
        this.wikiEnabled = wikiEnabled;
        this.showMedia = showMedia;
        this.id = id;
        this.submitText = submitText;
        this.displayName = displayName;
        this.headerImg = headerImg;
        this.descriptionHtml = descriptionHtml;
        this.title = title;
        this.collapseDeletedComments = collapseDeletedComments;
        this.over18 = over18;
        this.publicDescriptionHtml = publicDescriptionHtml;
        this.spoilersEnabled = spoilersEnabled;
        this.iconSize = iconSize;
        this.suggestedCommentSort = suggestedCommentSort;
        this.iconImg = iconImg;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public boolean isUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    public void setUserSrThemeEnabled(boolean userSrThemeEnabled) {
        this.userSrThemeEnabled = userSrThemeEnabled;
    }

    public String getSubmitTextHtml() {
        return submitTextHtml;
    }

    public void setSubmitTextHtml(String submitTextHtml) {
        this.submitTextHtml = submitTextHtml;
    }

    public String getUserIsBanned() {
        return userIsBanned;
    }

    public void setUserIsBanned(String userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    public boolean isWikiEnabled() {
        return wikiEnabled;
    }

    public void setWikiEnabled(boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    public boolean isShowMedia() {
        return showMedia;
    }

    public void setShowMedia(boolean showMedia) {
        this.showMedia = showMedia;
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

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    public void setCollapseDeletedComments(boolean collapseDeletedComments) {
        this.collapseDeletedComments = collapseDeletedComments;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    public void setPublicDescriptionHtml(String publicDescriptionHtml) {
        this.publicDescriptionHtml = publicDescriptionHtml;
    }

    public boolean isSpoilersEnabled() {
        return spoilersEnabled;
    }

    public void setSpoilersEnabled(boolean spoilersEnabled) {
        this.spoilersEnabled = spoilersEnabled;
    }

    @Override
    public String toString() {
        return "Reddit{" +
                "bannerImg='" + bannerImg + '\'' +
                ", userSrThemeEnabled=" + userSrThemeEnabled +
                ", submitTextHtml='" + submitTextHtml + '\'' +
                ", userIsBanned='" + userIsBanned + '\'' +
                ", wikiEnabled=" + wikiEnabled +
                ", showMedia=" + showMedia +
                ", id='" + id + '\'' +
                ", submitText='" + submitText + '\'' +
                ", displayName='" + displayName + '\'' +
                ", headerImg='" + headerImg + '\'' +
                ", descriptionHtml='" + descriptionHtml + '\'' +
                ", title='" + title + '\'' +
                ", collapseDeletedComments=" + collapseDeletedComments +
                ", over18=" + over18 +
                ", publicDescriptionHtml='" + publicDescriptionHtml + '\'' +
                ", spoilersEnabled=" + spoilersEnabled +
                ", iconSize=" + iconSize +
                ", suggestedCommentSort='" + suggestedCommentSort + '\'' +
                ", iconImg='" + iconImg + '\'' +
                ", headerTitle='" + headerTitle + '\'' +
                ", description='" + description + '\'' +
                ", userIsMuted='" + userIsMuted + '\'' +
                ", submitLinkLabel='" + submitLinkLabel + '\'' +
                ", accountsActive='" + accountsActive + '\'' +
                ", publicTraffic=" + publicTraffic +
                ", headerSize=" + headerSize +
                ", subscribers=" + subscribers +
                ", submitTextLabel='" + submitTextLabel + '\'' +
                ", lang='" + lang + '\'' +
                ", userIsModerator='" + userIsModerator + '\'' +
                ", keyColor='" + keyColor + '\'' +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", url='" + url + '\'' +
                ", quarantine=" + quarantine +
                ", hideAds=" + hideAds +
                ", createdUtc=" + createdUtc +
                ", bannerSize=" + bannerSize +
                ", userIsContributor='" + userIsContributor + '\'' +
                ", publicDescription='" + publicDescription + '\'' +
                ", showMediaPreview=" + showMediaPreview +
                ", commentScoreHideMins=" + commentScoreHideMins +
                ", subredditType='" + subredditType + '\'' +
                ", submissionType='" + submissionType + '\'' +
                ", userIsSubscriber='" + userIsSubscriber + '\'' +
                '}';
    }
}
