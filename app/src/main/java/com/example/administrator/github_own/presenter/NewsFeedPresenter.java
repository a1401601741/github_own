package com.example.administrator.github_own.presenter;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.contract.NewsFeedContract;
import com.example.administrator.github_own.utils.RxUtils;
import com.example.administrator.github_own.utils.StringUtils;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class NewsFeedPresenter extends RxPresenter<NewsFeedContract.View> implements
        NewsFeedContract.Presenter<NewsFeedContract.View> {


    private GithubApi mGithubApi;

    @Inject
    public NewsFeedPresenter(GithubApi githubApi) {
        this.mGithubApi = githubApi;
    }


    @Override
    public void getNewsFeedList(String username) {

        String aCacheKey = StringUtils.creatAcacheKey(username);
        Observable<NewsFeedList> fromNetWork = mGithubApi.getNewsFeedList(username)
                .compose(RxUtils.<NewsFeedList>rxCacheListHelper(aCacheKey));

        Subscription rxSubscription = Observable.concat(RxUtils.rxCreateDiskObservable(aCacheKey,
                NewsFeedList.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsFeedList>() {
                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(NewsFeedList list) {
                        mView.showNewsFeedList(list.mEventList,true);
                    }
                });
        addSubscribe(rxSubscription);

    }
}


















