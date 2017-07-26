package com.example.administrator.github_own.api;

import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.bean.User;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public interface GithubService {


    /**
     * 得到消息接口
     */
    @GET("/users/{username}/received_events")
    Observable<NewsFeedList> getNewsFeedList(@Path("username") String username);


    /**
     * 得到repository
     * @param username
     * @return
     */
    @GET("/users/{username}/repos")
    Observable<List<Repos>> getRepoList(@Path("username") String username);

    /**
     * 根据name搜索user
     */
    @GET("/search/users")
    Observable<User> getUserList(@Query("q") String q);

    @GET("/users/{username}")
    Observable<SingleUser> getSingleUser(@Path("username") String username);
}















