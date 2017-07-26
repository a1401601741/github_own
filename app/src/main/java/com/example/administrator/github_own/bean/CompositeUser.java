package com.example.administrator.github_own.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/25 0025.
 */

public class CompositeUser implements Serializable{

    private String name;
    private String avatar_url;
    private int follows;

    public int getRepos() {
        return repos;
    }

    public void setRepos(int repos) {
        this.repos = repos;
    }

    private int repos;

    public CompositeUser(String name, String avatar_url, int follows ,int repos) {
        this.name = name;
        this.avatar_url = avatar_url;
        this.follows = follows;
        this.repos = repos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }
}
