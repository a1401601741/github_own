package com.example.administrator.github_own.api;

import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.ReposList;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.bean.User;
import com.example.administrator.github_own.utils.Constants;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public class GithubApi {

    public static GithubApi mInstance;

    private GithubService mGithubService;

    public GithubApi(OkHttpClient okHttpClient) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constants.API_BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        mGithubService = retrofit.create(GithubService.class);
    }

    public static GithubApi getInstance(OkHttpClient okHttpClient) {
        if (mInstance == null) {
            mInstance = new GithubApi(okHttpClient);
        }
        return mInstance;
    }


    public Observable<NewsFeedList> getNewsFeedList(String username) {
        return mGithubService.getNewsFeedList(username);
    }

    public Observable<List<Repos>> getRepoList(String username) {
        return mGithubService.getRepoList(username);
    }

    public Observable<User> getUserList(String q) {
        return mGithubService.getUserList(q);
    }


    public Observable<SingleUser> getSingleUser(String username) {
        return mGithubService.getSingleUser(username)
                .subscribeOn(Schedulers.io());
    }

}













