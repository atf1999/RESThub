package com.atf.rest.hub.services;

import com.atf.rest.hub.models.CommitModel;
import com.atf.rest.hub.models.Repository;


import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tom on 7/9/16.
 */
public interface GithubService {
    String SERVICE_ENDPOINT = "https://api.github.com";

    //repo requests

    /**
     * Endpoint method to get all repos for a specified user
     * @param username github username
     * @return An Observable object of List<Repository>
     */
    @GET("/users/{username}/repos")
    Observable<List<Repository>> getUserRepos(@Path("username") String username);

    /**
     * Endpoint method to get all repos for an organization
     * @param org github organization name
     * @return An Observable object of List<Repository>
     */
    @GET("/orgs/{org}/repos")
    Observable<List<Repository>> getOrgRepos(@Path("org") String org);

    /**
     * Endpoint method to get info about a specific repo from a specific owner
     * @param owner github user
     * @param repo github repo name
     * @return An Observable object of Repository
     */
    @GET("/repos/{owner}/{repo}")
    Observable<Repository> getRepo(@Path("owner") String owner, @Path("repo") String repo);

    //Commits requests

    /**
     * Endpoint method to get list of commits from a specific repo of a specific user
     * @param owner github user
     * @param repo github repo name
     * @return An Observable object of List<CommitModel>
     */
    @GET("/repos/{owner}/{repo}/commits")
    Observable<List<CommitModel>> getCommitList(@Path("owner") String owner, @Path("repo") String repo);

    /**
     * Endpoint method to get a certain commit from a specific repo of a specific user based on the sha passed
     * @param owner github user
     * @param repo github repo name
     * @param sha commit's sha
     * @return An Observable object of CommitModel
     */
    @GET("/repos/{owner}/{repo}/commits/{sha}")
    Observable<CommitModel> getCommit(@Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha);
}
