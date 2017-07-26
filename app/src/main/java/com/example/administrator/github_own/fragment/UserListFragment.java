package com.example.administrator.github_own.fragment;

import android.os.Bundle;
import android.util.Log;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.adapter.UserListAdapter;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.UserListContract;
import com.example.administrator.github_own.presenter.UserListPresenter;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class UserListFragment extends BaseRxFragment<UserListPresenter, CompositeUser>
        implements UserListContract.View {

    public final static String USER_NAME = "username";

    public static UserListFragment newInstance(String username) {
        UserListFragment fragment = new UserListFragment();
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
        mPresenter.getUserList(username);
    }

    @Override
    public void configViews() {
        initAdapter(UserListAdapter.class, true, false);
        onRefresh();
    }


    @Override
    public void showUserList(List<CompositeUser> compositeUser, boolean isRefresh) {
        if (isRefresh) {
            mAdapter.clear();
        }
        mAdapter.addAll(compositeUser);
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
    public void addCompositeUser(CompositeUser compositeUser) {
        mAdapter.add(compositeUser);
    }


    @Override
    public void onLoadMore() {
        super.onLoadMore();

    }

    @Override
    public void onItemClick(int position) {

    }
}
