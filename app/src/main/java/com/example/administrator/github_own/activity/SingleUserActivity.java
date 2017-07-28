package com.example.administrator.github_own.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseActivity;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.fragment.SingleUserAboutFragment;
import com.example.administrator.github_own.fragment.SingleUserPublicActivityFragment;
import com.example.administrator.github_own.widget.RVPIndicator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class SingleUserActivity  extends BaseActivity{

    @Bind(R.id.rvp_indicator)
    RVPIndicator mRvpIndicator;
    @Bind(R.id.vp_single_user)
    ViewPager mVpSingleUser;
    private List<String> mDatas;

    private List<Fragment> mTabFragments;

    private FragmentPagerAdapter mAdapter;

    public final static String USER_NAME = "username";


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void initDatas() {
        String username = getIntent().getStringExtra(USER_NAME);
        mDatas = Arrays.asList(getResources().getStringArray(R.array.single_user_tabs));
        mTabFragments = new ArrayList<>();
        mTabFragments.add(SingleUserAboutFragment.newInstance(username));
        mTabFragments.add(new SingleUserPublicActivityFragment());

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mTabFragments.get(position);
            }

            @Override
            public int getCount() {
                return mTabFragments.size();
            }
        };
    }

    @Override
    protected void initToolBar() {
        mCommonToolbar.setTitle("User");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_single_common;
    }

    @Override
    public void configViews() {
        mRvpIndicator.setTabItemTitles(mDatas);
        mVpSingleUser.setAdapter(mAdapter);
        mVpSingleUser.setOffscreenPageLimit(2);
        mRvpIndicator.setViewPager(mVpSingleUser, 0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    public static void startActivity(Context context, String username) {
        context.startActivity(new Intent(context, SingleUserActivity.class).putExtra(USER_NAME,
                username));
    }

}
