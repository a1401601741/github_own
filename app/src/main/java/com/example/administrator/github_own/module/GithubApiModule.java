package com.example.administrator.github_own.module;

import com.example.administrator.github_own.api.GithubApi;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

@Module
public class GithubApiModule {

    @Provides
    public OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(10, TimeUnit
                .SECONDS)
                .connectTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(true);
        return builder.build();

    }

    @Provides
    protected GithubApi provideGithubService(OkHttpClient okHttpClient) {
        return GithubApi.getInstance(okHttpClient);
    }
}
