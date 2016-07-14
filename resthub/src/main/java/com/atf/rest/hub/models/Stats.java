package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("additions")
    @Expose
    private Integer additions;
    @SerializedName("deletions")
    @Expose
    private Integer deletions;
    @SerializedName("total")
    @Expose
    private Integer total;

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
     * The total
     */
    public Integer getTotal() {
        return total;
    }
}