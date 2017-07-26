package com.example.administrator.github_own.presenter;

import android.util.Log;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.contract.RepoListContract;
import com.example.administrator.github_own.utils.RxUtils;
import com.example.administrator.github_own.utils.StringUtils;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class RepoListPresenter extends RxPresenter<RepoListContract.View> implements
        RepoListContract.Presenter<RepoListContract.View> {

    private GithubApi mGithubApi;

    @Inject
    public RepoListPresenter(GithubApi githubApi) {
        this.mGithubApi = githubApi;
    }

    @Override
    public void getRepoList(String username) {
        String aCacheKey = StringUtils.creatAcacheKey(username);
        Observable<List<Repos>> fromNetWork = mGithubApi.getRepoList(username)
                .compose(RxUtils.<List<Repos>>rxCacheListHelper(aCacheKey));

        Subscription rxSubscription = Observable.concat(RxUtils.rxCreateDiskObservable(aCacheKey,
                NewsFeedList.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Repos>>() {

                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("onerror", e.getCause().getMessage().toString());
                        mView.showError();
                    }

                    @Override
                    public void onNext(List<Repos> list) {

                        Log.i("onnext", "Repo gets success");

                        mView.showRepoList(list, true);
                    }
                });

        addSubscribe(rxSubscription);
    }
}
