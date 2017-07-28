package com.example.administrator.github_own.fragment;

import android.os.Bundle;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.adapter.SearchRepoListAdapter;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.SearchRepos;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.SearchRepoListContract;
import com.example.administrator.github_own.presenter.SearchRepoListPresenter;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class SearchRepoListFragment extends BaseRxFragment<SearchRepoListPresenter, SearchRepos.ItemsBean>
        implements SearchRepoListContract.View {

    public final static String KEY_WORD = "keyoword";

    public static SearchRepoListFragment newInstance(String keyword) {
        SearchRepoListFragment fragment = new SearchRepoListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_WORD, keyword);
        fragment.setArguments(bundle);
        return fragment;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

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
        keyword = getArguments().getString(KEY_WORD);
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        mPresenter.getRepoList(keyword);
    }

    @Override
    public void configViews() {
        initAdapter(SearchRepoListAdapter.class, true, false);
        onRefresh();
    }

    @Override
    public void showSearchRepoList(SearchRepos list, boolean isRefresh) {
        if (isRefresh) {
            mAdapter.clear();
        }
        mAdapter.addAll(list.getItems());
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
