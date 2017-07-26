package com.example.administrator.github_own.fragment;

import android.os.Bundle;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.contract.SingleUserAboutContract;
import com.example.administrator.github_own.presenter.SingleUserAboutPresenter;

/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class SingleUserAboutFragment extends BaseRxFragment<SingleUserAboutPresenter, SingleUser>
        implements SingleUserAboutContract.View {

    public final static String USER_NAME = "username";

    public static SingleUserAboutFragment newInstance(String username) {
        SingleUserAboutFragment fragment = new SingleUserAboutFragment();
        Bundle bundle = new Bundle();
        bundle.putString(USER_NAME, username);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_single_user_about;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void initDatas() {

    }

    @Override
    public void configViews() {

    }

    @Override
    public void onItemClick(int position) {

    }
}
