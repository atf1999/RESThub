
package com.atf.rest.hub.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Author {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;

    /**
     * 
     * @return
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }


    /**
     * 
     * @return
     *     The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @return
     *     The siteAdmin
     */
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

}
