package com.atf.github.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.atf.rest.hub.Resthub;
import com.atf.rest.hub.models.Repository;

import java.util.List;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resthub.getUserRepositories("atf1999")
                .subscribeOn(Resthub.getScheduler())
                .observeOn(Resthub.getAndroidScheduler())
                .subscribe(new Subscriber<List<Repository>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Repository> repositories) {
                        for (Repository r : repositories) {
                            Log.d("repo full name", r.getFullName());
                        }
                    }
                });
    }
}


