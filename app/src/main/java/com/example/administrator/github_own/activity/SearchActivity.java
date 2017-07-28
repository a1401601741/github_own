package com.example.administrator.github_own.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseActivity;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.fragment.SearchRepoListFragment;
import com.example.administrator.github_own.fragment.UserListFragment;
import com.example.administrator.github_own.utils.ActivityUtils;
import com.yuyh.easyadapter.abslistview.EasyLVAdapter;
import com.yuyh.easyadapter.abslistview.EasyLVHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/7/27 0027.
 */

public class SearchActivity extends BaseActivity {

    enum TYPE{
        Repository,User,Code
    }

    @Bind(R.id.iv_search_back)
    ImageView mIvSearchBack;
    @Bind(R.id.iv_search_popwindow)
    ImageView mIvSearchPopwindow;
    @Bind(R.id.sv_search_pars)
    SearchView mEtSearchPars;
    @Bind(R.id.contentFrame)
    FrameLayout mContentFrame;

    private SearchRepoListFragment mSearchRepoListFragment;
    private UserListFragment mUserListFragment;
    private Fragment mCurrentFragment;

    private ListPopupWindow mListPopupWindow;
    private SelAdapter mAdapter;

    private List<String> data = new ArrayList<>();

    private TYPE SEARCH_TYPE;

    @Override
    protected void configViews() {
        mIvSearchBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mEtSearchPars.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                switch (SEARCH_TYPE) {
                    case Repository:
                        if (mSearchRepoListFragment == null) {
                            mSearchRepoListFragment = SearchRepoListFragment.newInstance(query);
                        } else {
                            mSearchRepoListFragment.setKeyword(query);
                            mSearchRepoListFragment.onRefresh();
                        }
                        mCurrentFragment=mSearchRepoListFragment;
                        break;
                    case User:
                        if (mUserListFragment == null) {
                            mUserListFragment = UserListFragment.newInstance(query);
                        } else {
                            mUserListFragment.setUsername(query);
                            mUserListFragment.onRefresh();
                        }
                        mCurrentFragment=mUserListFragment;
                        break;
                }

                ActivityUtils.replaceAndShowFragmentToActivity(getSupportFragmentManager(),
                        mCurrentFragment, null, null, R.id.contentFrame);
                return true;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        mIvSearchPopwindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListPopupWindow == null) {
                    initPopupWindow();
                }
                mListPopupWindow.show();
            }
        });

    }

    private void initPopupWindow() {
        mListPopupWindow = new ListPopupWindow(this);
        mAdapter = new SelAdapter(this, data);
        mListPopupWindow.setAdapter(mAdapter);
        mListPopupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mListPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mListPopupWindow.setAnchorView(mIvSearchPopwindow);
        mListPopupWindow.setForceIgnoreOutsideTouch(false);
        mListPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        mIvSearchPopwindow.setImageResource(R.drawable.icon_repositories);
                        SEARCH_TYPE = TYPE.Repository;
                        break;
                    case 1:
                        mIvSearchPopwindow.setImageResource(R.drawable.search_users);
                        SEARCH_TYPE=TYPE.User;
                        break;
                    case 2:
                        mIvSearchPopwindow.setImageResource(R.drawable.search_code);
                        SEARCH_TYPE=TYPE.Code;
                        break;
                }
                mListPopupWindow.dismiss();
            }
        });
    }

    @Override
    protected void initDatas() {
        data.add("Repository");
        data.add("User");
        data.add("Code");
    }

    @Override
    protected void initToolBar() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, SearchActivity.class));
    }

    class SelAdapter extends EasyLVAdapter<String> {


        public SelAdapter(Context context, List<String> list, int... layoutIds) {
            super(context, list, R.layout.layout_search_popup_window);
        }

        @Override
        public void convert(EasyLVHolder holder, int position, String s) {
            Log.i("ssssss", s);
            holder.setText(R.id.tv_search_pop_text, s);
            switch (position) {
                case 0:
                    holder.setImageResource(R.id.iv_search_pop_avatar, R.drawable.icon_repositories);
                    break;
                case 1:
                    holder.setImageResource(R.id.iv_search_pop_avatar, R.drawable.search_users);
                    break;
                case 2:
                    holder.setImageResource(R.id.iv_search_pop_avatar, R.drawable.search_code);
                    break;
            }
        }
    }

}
