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

    private boolean contestMode;
    private String bannedBy;
    private String domain;
    private String subreddit;
    private String selftextHtml;
    private String selftext;
    private String likes;
    private String suggestedSort;
    private List<String> userReports;
    private String secureMedia;
    private boolean saved;
    private String id;
    private int gilded;
    private SecureMediaEmbed secureMediaEmbed; // TODO This is an object
    private boolean clicked;
    private String reportReasons;
    private String author;
    private String media;
    private String name;
    private int score;
    private String approvedBy;
    private boolean over18;
    private String removalReason;
    private boolean hidden;
    //private List<ImageWrapper> preview; // TODO Add image wrapper
    private String thumbnail;
    private String subredditId;
    private boolean edited;
    private String linkFlairCssClass;
    private String authorFlairCssClass;
    private int downs;
    private List<String> modReports;
    private MediaEmbed archived;
    private String mediaEmbed; // TODO This is an object
    private String postHint;
    private boolean isSelf;
    private boolean hideScore;
    private boolean spoiler;
    private String permalink;
    private boolean locked;
    private boolean stickied;
    private Date created;
    private String url;
    private String authorFlairText;
    private boolean quarantine;
    private String title;
    private Date createdUtc;
    private String linkFlairText;
    private String distinguished;
    private int numComments;
    private boolean visited;
    private String numReports;
    private int ups;

    public Reddit() {
    }

    public Reddit(boolean contestMode, String bannedBy, String domain, String subreddit, String selftextHtml, String selftext, String likes, String suggestedSort, List<String> userReports, String secureMedia, boolean saved, String id, int gilded, SecureMediaEmbed secureMediaEmbed, boolean clicked, String reportReasons, String author, String media, String name, int score, String approvedBy, boolean over18, String removalReason, boolean hidden, String thumbnail, String subredditId, boolean edited, String linkFlairCssClass, String authorFlairCssClass, int downs, List<String> modReports, MediaEmbed archived, String mediaEmbed, String postHint, boolean isSelf, boolean hideScore, boolean spoiler, String permalink, boolean locked, boolean stickied, Date created, String url, String authorFlairText, boolean quarantine, String title, Date createdUtc, String linkFlairText, String distinguished, int numComments, boolean visited, String numReports, int ups) {
        this.contestMode = contestMode;
        this.bannedBy = bannedBy;
        this.domain = domain;
        this.subreddit = subreddit;
        this.selftextHtml = selftextHtml;
        this.selftext = selftext;
        this.likes = likes;
        this.suggestedSort = suggestedSort;
        this.userReports = userReports;
        this.secureMedia = secureMedia;
        this.saved = saved;
        this.id = id;
        this.gilded = gilded;
        this.secureMediaEmbed = secureMediaEmbed;
        this.clicked = clicked;
        this.reportReasons = reportReasons;
        this.author = author;
        this.media = media;
        this.name = name;
        this.score = score;
        this.approvedBy = approvedBy;
        this.over18 = over18;
        this.removalReason = removalReason;
        this.hidden = hidden;
        this.thumbnail = thumbnail;
        this.subredditId = subredditId;
        this.edited = edited;
        this.linkFlairCssClass = linkFlairCssClass;
        this.authorFlairCssClass = authorFlairCssClass;
        this.downs = downs;
        this.modReports = modReports;
        this.archived = archived;
        this.mediaEmbed = mediaEmbed;
        this.postHint = postHint;
        this.isSelf = isSelf;
        this.hideScore = hideScore;
        this.spoiler = spoiler;
        this.permalink = permalink;
        this.locked = locked;
        this.stickied = stickied;
        this.created = created;
        this.url = url;
        this.authorFlairText = authorFlairText;
        this.quarantine = quarantine;
        this.title = title;
        this.createdUtc = createdUtc;
        this.linkFlairText = linkFlairText;
        this.distinguished = distinguished;
        this.numComments = numComments;
        this.visited = visited;
        this.numReports = numReports;
        this.ups = ups;
    }

    public boolean isContestMode() {
        return contestMode;
    }

    public void setContestMode(boolean contestMode) {
        this.contestMode = contestMode;
    }

    public String getBannedBy() {
        return bannedBy;
    }

    public void setBannedBy(String bannedBy) {
        this.bannedBy = bannedBy;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSelftextHtml() {
        return selftextHtml;
    }

    public void setSelftextHtml(String selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(String suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public List<String> getUserReports() {
        return userReports;
    }

    public void setUserReports(List<String> userReports) {
        this.userReports = userReports;
    }

    public String getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(String secureMedia) {
        this.secureMedia = secureMedia;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(String reportReasons) {
        this.reportReasons = reportReasons;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public String getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(String removalReason) {
        this.removalReason = removalReason;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public List<String> getModReports() {
        return modReports;
    }

    public void setModReports(List<String> modReports) {
        this.modReports = modReports;
    }

    public MediaEmbed getArchived() {
        return archived;
    }

    public void setArchived(MediaEmbed archived) {
        this.archived = archived;
    }

    public String getMediaEmbed() {
        return mediaEmbed;
    }

    public void setMediaEmbed(String mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public boolean isSelf() {
        return isSelf;
    }

    public void setSelf(boolean self) {
        isSelf = self;
    }

    public boolean isHideScore() {
        return hideScore;
    }

    public void setHideScore(boolean hideScore) {
        this.hideScore = hideScore;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isStickied() {
        return stickied;
    }

    public void setStickied(boolean stickied) {
        this.stickied = stickied;
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

    public String getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(String authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Date createdUtc) {
        this.createdUtc = createdUtc;
    }

    public String getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public String getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(String distinguished) {
        this.distinguished = distinguished;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getNumReports() {
        return numReports;
    }

    public void setNumReports(String numReports) {
        this.numReports = numReports;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    @Override
    public String toString() {
        return "Reddit{" +
                "contestMode=" + contestMode +
                ", bannedBy='" + bannedBy + '\'' +
                ", domain='" + domain + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", selftextHtml='" + selftextHtml + '\'' +
                ", selftext='" + selftext + '\'' +
                ", likes='" + likes + '\'' +
                ", suggestedSort='" + suggestedSort + '\'' +
                ", userReports=" + userReports +
                ", secureMedia='" + secureMedia + '\'' +
                ", saved=" + saved +
                ", id='" + id + '\'' +
                ", gilded=" + gilded +
                ", secureMediaEmbed=" + secureMediaEmbed +
                ", clicked=" + clicked +
                ", reportReasons='" + reportReasons + '\'' +
                ", author='" + author + '\'' +
                ", media='" + media + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", approvedBy='" + approvedBy + '\'' +
                ", over18=" + over18 +
                ", removalReason='" + removalReason + '\'' +
                ", hidden=" + hidden +
                ", thumbnail='" + thumbnail + '\'' +
                ", subredditId='" + subredditId + '\'' +
                ", edited=" + edited +
                ", linkFlairCssClass='" + linkFlairCssClass + '\'' +
                ", authorFlairCssClass='" + authorFlairCssClass + '\'' +
                ", downs=" + downs +
                ", modReports=" + modReports +
                ", archived=" + archived +
                ", mediaEmbed='" + mediaEmbed + '\'' +
                ", postHint='" + postHint + '\'' +
                ", isSelf=" + isSelf +
                ", hideScore=" + hideScore +
                ", spoiler=" + spoiler +
                ", permalink='" + permalink + '\'' +
                ", locked=" + locked +
                ", stickied=" + stickied +
                ", created=" + created +
                ", url='" + url + '\'' +
                ", authorFlairText='" + authorFlairText + '\'' +
                ", quarantine=" + quarantine +
                ", title='" + title + '\'' +
                ", createdUtc=" + createdUtc +
                ", linkFlairText='" + linkFlairText + '\'' +
                ", distinguished='" + distinguished + '\'' +
                ", numComments=" + numComments +
                ", visited=" + visited +
                ", numReports='" + numReports + '\'' +
                ", ups=" + ups +
                '}';
    }
}
