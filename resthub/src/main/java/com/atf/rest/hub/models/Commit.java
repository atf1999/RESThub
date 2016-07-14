
package com.atf.rest.hub.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Commit {

    @SerializedName("committer")
    @Expose
    private Committer committer;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;

    /**
     * 
     * @return
     *     The committer
     */
    public Committer getCommitter() {
        return committer;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

}
