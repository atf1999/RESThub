package com.atf.github.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atf.rest.hub.GithubAPI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GithubAPI git = new GithubAPI();
        git.getRepositories("atf1999");
    }
}
