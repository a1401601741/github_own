package com.example.administrator.github_own;

import android.app.Application;

import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerAppComponent;
import com.example.administrator.github_own.module.AppModule;
import com.example.administrator.github_own.module.GithubApiModule;
import com.example.administrator.github_own.utils.AppUtil;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public class GithubApplication extends Application {

    private static GithubApplication sInstance;
    private AppComponent mAppComponent;

    public static GithubApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance=this;
        initComponent();

        AppUtil.init(this);
    }

    private void initComponent() {
        mAppComponent= DaggerAppComponent.builder()
                .githubApiModule(new GithubApiModule())
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getmAppComponent(){
        return mAppComponent;
    }
}
