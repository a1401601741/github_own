package com.example.administrator.github_own.contract;

import com.example.administrator.github_own.base.BaseContract;
import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.bean.User;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/7/25 0025.
 */

public interface UserListContract {

    interface View extends BaseContract.BaseView {
        void showUserList(List<CompositeUser> compositeUser, boolean isRefresh);
        void complete();
        void showError();
        void addCompositeUser(CompositeUser compositeUser);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getUserList(String username);
    }
}
