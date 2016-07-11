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

/**
 * Created by tom on 7/11/16.
 */
public class GithubAPI {
    Retrofit retrofit = ServiceFactory.RETROFIT;
    GithubService service = retrofit.create(GithubService.class);
    public void getRepositories(String name){
        Observable<List<Repository>> repos = service.getRepos(name);
        repos.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Repository>>() {
                    @Override
                    public void onCompleted() {
                        Log.d("completed", "restREQ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("err", e.getMessage());
                    }

                    @Override
                    public void onNext(List<Repository> repos) {
                        for(Repository r : repos){
                            Log.d("repo full name", r.getFullName());
                        }
                    }
                });
    }
}
