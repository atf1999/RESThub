package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repositories{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("forks")
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @SerializedName("watchers")
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return
     * The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @return
     * The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     *
     * @return
     * The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     *
     * @return
     * The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }


    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }


    /**
     *
     * @return
     * The fork
     */
    public Boolean getFork() {
        return fork;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }


    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @return
     * The pushedAt
     */
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     *
     * @return
     * The cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     *
     * @return
     * The svnUrl
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     *
     * @return
     * The stargazersCount
     */
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     *
     * @return
     * The watchersCount
     */
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     *
     * @return
     * The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @return
     * The hasIssues
     */
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     *
     * @return
     * The hasDownloads
     */
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     *
     * @return
     * The hasWiki
     */
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     *
     * @return
     * The hasPages
     */
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     *
     * @return
     * The forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     *
     * @return
     * The openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     *
     * @return
     * The forks
     */
    public Integer getForks() {
        return forks;
    }

    /**
     *
     * @return
     * The openIssues
     */
    public Integer getOpenIssues() {
        return openIssues;
    }


    /**
     *
     * @return
     * The watchers
     */
    public Integer getWatchers() {
        return watchers;
    }

    /**
     *
     * @return
     * The defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

}