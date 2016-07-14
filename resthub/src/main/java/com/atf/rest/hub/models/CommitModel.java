
package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class CommitModel {

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("commit")
    @Expose
    private Commit commit;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("files")
    @Expose
    private List<File> files = new ArrayList<File>();

    /**
     * 
     * @return
     *     The sha
     */
    public String getSha() {
        return sha;
    }

    /**
     * 
     * @return
     *     The commit
     */
    public Commit getCommit() {
        return commit;
    }

    /**
     * 
     * @return
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @return
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     *
     * @return
     * The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     *
     * @return
     * The files
     */
    public List<File> getFiles() {
        return files;
    }

}
