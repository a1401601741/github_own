package com.example.administrator.github_own.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseActivity;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.event.SearchEvent;
import com.example.administrator.github_own.fragment.RepoListFragment;
import com.example.administrator.github_own.fragment.UserListFragment;
import com.example.administrator.github_own.presenter.MainActivityPresenter;
import com.example.administrator.github_own.utils.ActivityUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public final static String USER_NAME = "username";
    @Inject
    MainActivityPresenter mainActivityPresenter;

    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @Bind(R.id.nav_view)
    NavigationView mNavView;

    private RepoListFragment mRepoListFragment;

    private Fragment mCurrentFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerGithubComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }


    @Override
    protected void configViews() {
        initFragment();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, mCommonToolbar, R.string.navigation_drawer_open, R.string
                .navigation_drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        mNavView.setNavigationItemSelectedListener(this);
        EventBus.getDefault().register(this);
    }

    private void initFragment() {
        if (mRepoListFragment == null) {
            mRepoListFragment = RepoListFragment.newInstance("mojombo");
        }
    }

    @Override
    protected void initDatas() {
    }

    @Override
    protected void initToolBar() {
        mCommonToolbar.setTitle("Profile");
        mCommonToolbar.setNavigationIcon(R.drawable.ab_back);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_news_feed) {
            // Handle the camera action
        } else if (id == R.id.nav_nofication) {

        } else if (id == R.id.nav_my_repositories) {

            mCurrentFragment = mRepoListFragment;
            ActivityUtils.addAndShowFragmentToActivity(getSupportFragmentManager(),
                    mRepoListFragment, null, null, R.id.contentFrame);

        } else if (id == R.id.nav_search) {

//            mCurrentFragment = mUserListFragment;
//            ActivityUtils.addAndShowFragmentToActivity(getSupportFragmentManager(),
//                    mUserListFragment, null, null, R.id.contentFrame);
            SearchActivity.startActivity(this);

        } else if (id == R.id.nav_my_pull_requests) {

//            SearchActivity.startActivity(this);

        } else if (id == R.id.nav_my_gists) {
            UserListAcitivity.startActivity(this);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void searchUserList(SearchEvent searchEvent) {

    }


    public static void startActivity(Context context, String username) {
        context.startActivity(new Intent(context, MainActivity.class).putExtra(USER_NAME,
                username));
    }
}
