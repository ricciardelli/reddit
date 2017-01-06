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

    public Category() {
    }

    public Category(String bannerImg, boolean userSrThemeEnabled, String submitTextHtml, String userIsBanned, boolean wikiEnabled, boolean showMedia, String id, String submitText, String displayName, String headerImg, String descriptionHtml, String title, boolean collapseDeletedComments, boolean over18, String publicDescriptionHtml, boolean spoilersEnabled, List<Integer> iconSize, String suggestedCommentSort, String iconImg, String headerTitle, String description, String userIsMuted, String submitLinkLabel, String accountsActive, boolean publicTraffic, List<Integer> headerSize, long subscribers, String submitTextLabel, String lang, String userIsModerator, String keyColor, String name, Date created, String url, boolean quarantine, boolean hideAds, Date createdUtc, List<Integer> bannerSize, String userIsContributor, String publicDescription, boolean showMediaPreview, int commentScoreHideMins, String subredditType, String submissionType, String userIsSubscriber) {
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
        this.headerTitle = headerTitle;
        this.description = description;
        this.userIsMuted = userIsMuted;
        this.submitLinkLabel = submitLinkLabel;
        this.accountsActive = accountsActive;
        this.publicTraffic = publicTraffic;
        this.headerSize = headerSize;
        this.subscribers = subscribers;
        this.submitTextLabel = submitTextLabel;
        this.lang = lang;
        this.userIsModerator = userIsModerator;
        this.keyColor = keyColor;
        this.name = name;
        this.created = created;
        this.url = url;
        this.quarantine = quarantine;
        this.hideAds = hideAds;
        this.createdUtc = createdUtc;
        this.bannerSize = bannerSize;
        this.userIsContributor = userIsContributor;
        this.publicDescription = publicDescription;
        this.showMediaPreview = showMediaPreview;
        this.commentScoreHideMins = commentScoreHideMins;
        this.subredditType = subredditType;
        this.submissionType = submissionType;
        this.userIsSubscriber = userIsSubscriber;
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

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    public void setSuggestedCommentSort(String suggestedCommentSort) {
        this.suggestedCommentSort = suggestedCommentSort;
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

    public String getUserIsMuted() {
        return userIsMuted;
    }

    public void setUserIsMuted(String userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    public String getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public void setSubmitLinkLabel(String submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    public String getAccountsActive() {
        return accountsActive;
    }

    public void setAccountsActive(String accountsActive) {
        this.accountsActive = accountsActive;
    }

    public boolean isPublicTraffic() {
        return publicTraffic;
    }

    public void setPublicTraffic(boolean publicTraffic) {
        this.publicTraffic = publicTraffic;
    }

    public List<Integer> getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(List<Integer> headerSize) {
        this.headerSize = headerSize;
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

    public String getUserIsModerator() {
        return userIsModerator;
    }

    public void setUserIsModerator(String userIsModerator) {
        this.userIsModerator = userIsModerator;
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

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public boolean isHideAds() {
        return hideAds;
    }

    public void setHideAds(boolean hideAds) {
        this.hideAds = hideAds;
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

    public String getUserIsContributor() {
        return userIsContributor;
    }

    public void setUserIsContributor(String userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public boolean isShowMediaPreview() {
        return showMediaPreview;
    }

    public void setShowMediaPreview(boolean showMediaPreview) {
        this.showMediaPreview = showMediaPreview;
    }

    public int getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    public void setCommentScoreHideMins(int commentScoreHideMins) {
        this.commentScoreHideMins = commentScoreHideMins;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public String getUserIsSubscriber() {
        return userIsSubscriber;
    }

    public void setUserIsSubscriber(String userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }

    @Override
    public String toString() {
        return "Category{" +
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
