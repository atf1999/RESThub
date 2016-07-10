package com.atf.rest.hub.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
public class ServiceFactory {

    public static Retrofit RETROFIT = createRetrofit(GithubService.SERVICE_ENDPOINT);

    /**
     * Creates a retrofit instance from a given endpoint
     * @param endPoint REST endpoint url
     * @return retrofit service with defined endpoint
     */
    public static Retrofit createRetrofit(final String endPoint) {
       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(endPoint)
               .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
               .addConverterFactory(GsonConverterFactory.create())
               .build();
        return retrofit;
    }

}