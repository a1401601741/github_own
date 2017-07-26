package com.example.administrator.github_own.fragment;

import android.os.Bundle;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.adapter.RepoListAdapter;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.RepoListContract;
import com.example.administrator.github_own.presenter.RepoListPresenter;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class RepoListFragment extends BaseRxFragment<RepoListPresenter, Repos>
        implements RepoListContract.View {

    public final static String USER_NAME = "username";

    public static RepoListFragment newInstance(String username) {
        RepoListFragment fragment = new RepoListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(USER_NAME, username);
        fragment.setArguments(bundle);
        return fragment;
    }

    private String username;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_common;
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
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        mPresenter.getRepoList(username);
    }

    @Override
    public void configViews() {
        initAdapter(RepoListAdapter.class, true, false);
        onRefresh();
    }

    @Override
    public void showRepoList(List<Repos> list, boolean isRefresh) {
        if (isRefresh) {
            mAdapter.clear();
        }
        mAdapter.addAll(list);
    }

    @Override
    public void complete() {
        mEasyRecyclerView.setRefreshing(false);
    }

    @Override
    public void showError() {
        loaddingError();
    }

    @Override
    public void onLoadMore() {
        super.onLoadMore();

    }

    @Override
    public void onItemClick(int position) {

    }
}
