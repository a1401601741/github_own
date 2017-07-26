package com.example.administrator.github_own.component;

import com.example.administrator.github_own.activity.MainActivity;
import com.example.administrator.github_own.fragment.NewsFeedFragment;
import com.example.administrator.github_own.fragment.RepoListFragment;
import com.example.administrator.github_own.fragment.UserListFragment;

import dagger.Component;

/**
 * Created by asus on 2017/7/22.
 */

@Component(dependencies = AppComponent.class)
public interface GithubComponent {
    MainActivity inject(MainActivity activity);

    NewsFeedFragment inject(NewsFeedFragment fragment);

    RepoListFragment inject(RepoListFragment fragment);

    UserListFragment inject(UserListFragment fragment);
}
