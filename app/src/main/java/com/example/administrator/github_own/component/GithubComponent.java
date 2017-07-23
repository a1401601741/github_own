package com.example.administrator.github_own.component;

import com.example.administrator.github_own.activity.MainActivity;

import dagger.Component;

/**
 * Created by asus on 2017/7/22.
 */

@Component(dependencies = AppComponent.class)
public interface GithubComponent {
    MainActivity inject(MainActivity activity);
}
