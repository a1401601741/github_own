package com.example.administrator.github_own.presenter;

import android.util.Log;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.bean.User;
import com.example.administrator.github_own.contract.UserListContract;
import com.example.administrator.github_own.utils.RxUtils;
import com.example.administrator.github_own.utils.StringUtils;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class UserListPresenter extends RxPresenter<UserListContract.View> implements
        UserListContract.Presenter<UserListContract.View> {

    private GithubApi mGithubApi;

    @Inject
    public UserListPresenter(GithubApi githubApi) {
        this.mGithubApi = githubApi;
    }

    @Override
    public void getUserList(String username) {
        String aCacheKey = StringUtils.creatAcacheKey(username);
        Observable<User> fromNetWork = mGithubApi.getUserList(username)
                .compose(RxUtils.<User>rxCacheListHelper(aCacheKey));

        Subscription rxSubscription = Observable.concat(RxUtils.rxCreateDiskObservable(aCacheKey,
                NewsFeedList.class), fromNetWork)
                .flatMap(new Func1<User, Observable<User.ItemsBean>>() {
                    @Override
                    public Observable<User.ItemsBean> call(User user) {
                        return Observable.from(user.getItems());
                    }
                })
//                .flatMap(new Func1<User.ItemsBean, Observable<SingleUser>>() {
//                    @Override
//                    public Observable<SingleUser> call(User.ItemsBean itemsBean) {
//                        return mGithubApi.getSingleUser(itemsBean.getLogin());
//                    }
//                })
//                .map(new Func1<SingleUser, CompositeUser>() {
//                    @Override
//                    public CompositeUser call(SingleUser singleUser) {
//                        return new CompositeUser(singleUser.getName(), singleUser.getAvatar_url()
//                                , singleUser.getFollowers(),singleUser.getPublic_repos());
//                    }
//                })
                .map(new Func1<User.ItemsBean, CompositeUser>(){
                    @Override
                    public CompositeUser call(User.ItemsBean itemsBean) {
                        return new CompositeUser(itemsBean.getLogin(),itemsBean.getAvatar_url(),1,1);
                    }
                })
                .toList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<CompositeUser>>() {
                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(List<CompositeUser> compositeUser) {
                        mView.showUserList(compositeUser, false);
                    }
                });

        addSubscribe(rxSubscription);
    }
}
