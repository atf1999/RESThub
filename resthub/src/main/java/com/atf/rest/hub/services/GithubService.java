package com.atf.rest.hub.services;

import com.atf.rest.hub.models.Repositories;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tom on 7/9/16.
 */
public interface GithubService {
    String SERVICE_ENDPOINT = "https://api.github.com";

    @GET("/users/{username}/repos")
    Observable<Repositories> getRepos(@Path("username") String username);
}
