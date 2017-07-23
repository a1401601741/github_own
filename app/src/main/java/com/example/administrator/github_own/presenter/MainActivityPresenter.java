package com.example.administrator.github_own.presenter;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.contract.MainActivityContract;

import javax.inject.Inject;

/**
 * Created by asus on 2017/7/22.
 */

public class MainActivityPresenter extends RxPresenter<MainActivityContract.View> implements
        MainActivityContract.Presenter<MainActivityContract.View> {

    private GithubApi mGithubApi;

    @Inject
    public MainActivityPresenter(GithubApi githubApi) {
        this.mGithubApi=githubApi;
    }


}
