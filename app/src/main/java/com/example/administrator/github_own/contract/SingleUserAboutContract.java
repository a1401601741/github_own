package com.example.administrator.github_own.contract;

import com.example.administrator.github_own.base.BaseContract;
import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SingleUser;

import java.util.List;

/**
 * Created by Administrator on 2017/7/25 0025.
 */

public interface SingleUserAboutContract {

    interface View extends BaseContract.BaseView {

        void showUserInfoDetail(SingleUser singleUser);

        void showSingleUserRepo(List<Repos> reposes, boolean isRefresh);

        void compelte();

        void showError();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getSingleUserInfoDetail(String username);

        void getSingleUserRepos(String username);
    }
}
