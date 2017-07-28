package com.example.administrator.github_own.base;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public interface BaseContract {

    interface BasePresenter<T> {

        void attachView(T view);

        void detachView();


    }


    interface BaseView {

    }


}
