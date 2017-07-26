package com.example.administrator.github_own.fragment;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.NewsFeedContract;
import com.example.administrator.github_own.presenter.NewsFeedPresenter;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class NewsFeedFragment extends BaseRxFragment<NewsFeedPresenter, NewsFeedList.SingleEvent>
        implements NewsFeedContract.View {


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_newfeed;
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

    }

    @Override
    public void configViews() {
    }

    @Override
    public void showNewsFeedList(List<NewsFeedList.SingleEvent> list, boolean isRefresh) {

    }

    @Override
    public void complete() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void onItemClick(int position) {

    }
}
