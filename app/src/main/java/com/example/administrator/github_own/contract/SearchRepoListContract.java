package com.example.administrator.github_own.contract;

import com.example.administrator.github_own.base.BaseContract;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SearchRepos;

import java.util.List;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public interface SearchRepoListContract {

    interface View extends BaseContract.BaseView {
        void showSearchRepoList(SearchRepos list, boolean isRefresh);
        void complete();
        void showError();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getRepoList(String username);
    }
}
