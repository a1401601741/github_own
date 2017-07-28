package com.example.administrator.github_own.api;

import com.example.administrator.github_own.bean.NewsFeedList;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SearchRepos;
import com.example.administrator.github_own.bean.SingleRepo;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.bean.User;

import java.util.List;

import dagger.Provides;
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
     *
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

    /**
     * 根据username得到用户具体信息
     *
     * @param username
     * @return
     */
    @GET("/users/{username}")
    Observable<SingleUser> getSingleUser(@Path("username") String username);

    /**
     * 根据关键词搜索指定repository
     */
    @GET("/search/repositories")
    Observable<SearchRepos> getSearchRepos(@Query("q") String keyWord, @Query("sort") String
            sort, @Query("order") String order);

    /**
     * 根据username和仓库名获取指定仓库信息
     */
    @GET("/repos/{username}/{reponame}")
    Observable<SingleRepo> getSingleRepo(@Path("username") String username, @Path("reponame")
            String reponame);

}


















