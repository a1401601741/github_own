package com.example.administrator.github_own.presenter;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.contract.SingleUserAboutContract;
import com.example.administrator.github_own.fragment.SingleUserAboutFragment;

import java.util.List;

import javax.inject.Inject;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.internal.util.ActionSubscriber;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class SingleUserAboutPresenter extends RxPresenter<SingleUserAboutContract.View> implements
        SingleUserAboutContract.Presenter<SingleUserAboutContract.View> {

    private GithubApi mGithubApi;

    @Inject
    public SingleUserAboutPresenter(GithubApi githubApi) {
        this.mGithubApi = githubApi;
    }

    @Override
    public void getSingleUserInfoDetail(String username) {
        Subscription rxSubscription = mGithubApi.getSingleUser(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SingleUser>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(SingleUser singleUser) {
                        mView.showUserInfoDetail(singleUser);
                    }
                });
        addSubscribe(rxSubscription);
    }

    @Override
    public void getSingleUserRepos(String username) {
        Subscription rxSubscription=mGithubApi.getRepoList(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Repos>>() {
                    @Override
                    public void onCompleted() {
                        mView.compelte();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(List<Repos> reposes) {
                        mView.showSingleUserRepo(reposes, false);
                    }
                });
        addSubscribe(rxSubscription);

    }
}
