package com.example.administrator.github_own.api;

import com.example.administrator.github_own.utils.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public class GithubApi {

    public static GithubApi mInstance;

    private GithubService mGithubService;

    public GithubApi(OkHttpClient okHttpClient) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constants.API_BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        mGithubService = retrofit.create(GithubService.class);
    }

    public static GithubApi getInstance(OkHttpClient okHttpClient) {
        if (mInstance == null) {
            mInstance = new GithubApi(okHttpClient);
        }
        return mInstance;
    }


}













