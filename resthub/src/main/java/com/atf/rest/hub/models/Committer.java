
package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Committer {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

}
