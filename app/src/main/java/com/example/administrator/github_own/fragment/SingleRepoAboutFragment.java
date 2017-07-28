package com.example.administrator.github_own.fragment;

import android.os.Bundle;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.SingleRepo;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.SingleRepoAboutContract;
import com.example.administrator.github_own.presenter.SingleRepoAboutPresenter;

/**
 * Created by Administrator on 2017/7/28 0028.
 */

public class SingleRepoAboutFragment extends BaseRxFragment<SingleRepoAboutPresenter, SingleRepo>
        implements SingleRepoAboutContract.View {

    public final static String USER_NAME = "username";
    public final static String REPO_NAME = "reponame";

    private String username;
    private String reponame;

    public static SingleRepoAboutFragment newInstance(String username,String reponame) {
        SingleRepoAboutFragment fragment = new SingleRepoAboutFragment();
        Bundle bundle = new Bundle();
        bundle.putString(USER_NAME, username);
        bundle.putString(REPO_NAME,reponame);
        fragment.setArguments(bundle);
        return fragment;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setReponame(String reponame) {
        this.reponame = reponame;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_single_repo_about;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerGithubComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void initDatas() {
        username = getArguments().getString(USER_NAME);
        reponame = getArguments().getString(REPO_NAME);
    }

    @Override
    public void configViews() {

    }

    @Override
    public void onItemClick(int position) {

    }
}
