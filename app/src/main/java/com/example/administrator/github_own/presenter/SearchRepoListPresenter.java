package com.example.administrator.github_own.presenter;

import com.example.administrator.github_own.api.GithubApi;
import com.example.administrator.github_own.base.RxPresenter;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SearchRepos;
import com.example.administrator.github_own.contract.RepoListContract;
import com.example.administrator.github_own.contract.SearchRepoListContract;
import com.example.administrator.github_own.fragment.SearchRepoListFragment;
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

public class SearchRepoListPresenter extends RxPresenter<SearchRepoListContract.View> implements
        RepoListContract.Presenter<SearchRepoListContract.View> {

    private GithubApi mGithubApi;

    @Inject
    public SearchRepoListPresenter(GithubApi githubApi) {
        this.mGithubApi = githubApi;
    }

    @Override
    public void getRepoList(String username) {
        String aCacheKey = StringUtils.creatAcacheKey(username);
        Observable<SearchRepos> fromNetWork = mGithubApi.getSearchRepos(username)
                .compose(RxUtils.<SearchRepos>rxCacheListHelper(aCacheKey));

        Subscription rxSubscription = Observable.concat(RxUtils.rxCreateDiskObservable(aCacheKey,
                NewsFeedList.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchRepos>() {

                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(SearchRepos list) {
                        mView.showSearchRepoList(list,true);
                    }
                });

        addSubscribe(rxSubscription);
    }
}
