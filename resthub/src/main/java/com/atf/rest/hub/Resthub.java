package com.atf.rest.hub;

import android.util.Log;

import com.atf.rest.hub.models.Repository;
import com.atf.rest.hub.services.GithubService;
import com.atf.rest.hub.services.ServiceFactory;


import java.util.List;

import retrofit2.Retrofit;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.Scheduler;

/**
 * Created by tom on 7/11/16.
 */
public class Resthub {
    static Retrofit retrofit = ServiceFactory.RETROFIT;
    static GithubService service = retrofit.create(GithubService.class);

    public static Scheduler getScheduler(){
        return Schedulers.newThread();
    }

    public static Scheduler getAndroidScheduler(){
        return AndroidSchedulers.mainThread();
    }

    public static Observable<List<Repository>> getUserRepositories(String name){
        return service.getUserRepos(name);
    }

    public static Observable<List<Repository>> getOrgRepositories(String name){
        return service.getOrgRepos(name);
    }



  }
