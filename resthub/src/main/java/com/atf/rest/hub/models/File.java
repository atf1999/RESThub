package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class File {

    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("additions")
    @Expose
    private Integer additions;
    @SerializedName("deletions")
    @Expose
    private Integer deletions;
    @SerializedName("changes")
    @Expose
    private Integer changes;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("raw_url")
    @Expose
    private String rawUrl;
    @SerializedName("blob_url")
    @Expose
    private String blobUrl;

    /**
     *
     * @return
     * The filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     *
     * @return
     * The additions
     */
    public Integer getAdditions() {
        return additions;
    }

    /**
     *
     * @return
     * The deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    /**
     *
     * @return
     * The changes
     */
    public Integer getChanges() {
        return changes;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @return
     * The rawUrl
     */
    public String getRawUrl() {
        return rawUrl;
    }

    /**
     *
     * @return
     * The blobUrl
     */
    public String getBlobUrl() {
        return blobUrl;
    }

}
