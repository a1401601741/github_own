package com.example.administrator.github_own.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrator.github_own.GithubApplication;
import com.example.administrator.github_own.R;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.utils.StatusBarCompat;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/21 0021.
 */

public abstract class BaseActivity extends AppCompatActivity {
    public Toolbar mCommonToolbar;

    protected Context mContext;
    protected int statusBarColor = 0;
    protected View statusBarView = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if (statusBarColor == 0) {
            statusBarView = StatusBarCompat.compat(this, ContextCompat.getColor(this, R.color
                    .colorPrimaryDark));
        } else if (statusBarColor != -1) {
            statusBarView = StatusBarCompat.compat(this, statusBarColor);
        }

        transparent19or20();
        mContext=this;
        ButterKnife.bind(this);
        setupActivityComponent(GithubApplication.getInstance().getmAppComponent());
        mCommonToolbar = ButterKnife.findById(this, R.id.common_toolbar);
        if (mCommonToolbar != null) {
            initToolBar();
            setSupportActionBar(mCommonToolbar);
        }
        initDatas();
        configViews();
    }

    protected abstract void configViews();

    protected abstract void initDatas();

    protected abstract void initToolBar();

    private void transparent19or20() {
    }

    protected abstract int getLayoutId();

    protected abstract void setupActivityComponent(AppComponent appComponent);


}
