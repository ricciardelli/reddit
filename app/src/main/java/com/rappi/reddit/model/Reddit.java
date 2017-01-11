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

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Base class for reddit data.
 *
 * @author Richard Ricciardelli
 * @version 1.0
 */
public class Reddit extends RealmObject {

    private String domain;
    private String subreddit;
    private String selftext;
    private String likes;
    @PrimaryKey
    private String id;
    private String author;
    private String name;
    private int score;
    private Preview preview;
    private String approvedBy;
    private String thumbnail;
    private String subredditId;
    private String linkFlairCssClass;
    private int downs;
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

    public Reddit(String domain, String subreddit, String selftext, String likes, String id, String author, String name, int score, Preview preview, String approvedBy, String thumbnail, String subredditId, String linkFlairCssClass, int downs, boolean isSelf, boolean hideScore, boolean spoiler, String permalink, boolean locked, boolean stickied, Date created, String url, String authorFlairText, boolean quarantine, String title, Date createdUtc, String linkFlairText, String distinguished, int numComments, boolean visited, String numReports, int ups) {
        this.domain = domain;
        this.subreddit = subreddit;
        this.selftext = selftext;
        this.likes = likes;
        this.id = id;
        this.author = author;
        this.name = name;
        this.score = score;
        this.preview = preview;
        this.approvedBy = approvedBy;
        this.thumbnail = thumbnail;
        this.subredditId = subredditId;
        this.linkFlairCssClass = linkFlairCssClass;
        this.downs = downs;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
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

    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
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
                "domain='" + domain + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", selftext='" + selftext + '\'' +
                ", likes='" + likes + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", preview=" + preview +
                ", approvedBy='" + approvedBy + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", subredditId='" + subredditId + '\'' +
                ", linkFlairCssClass='" + linkFlairCssClass + '\'' +
                ", downs=" + downs +
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
