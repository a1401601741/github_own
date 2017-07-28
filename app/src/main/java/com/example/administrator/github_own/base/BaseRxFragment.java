package com.example.administrator.github_own.base;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.LinearLayout;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.recyclerview.EasyRecyclerView;
import com.example.administrator.github_own.recyclerview.adapter.OnLoadMoreListener;
import com.example.administrator.github_own.recyclerview.adapter.RecyclerArrayAdapter;
import com.example.administrator.github_own.recyclerview.swipe.OnRefreshListener;

import java.lang.reflect.Constructor;

import javax.inject.Inject;

import butterknife.Bind;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public abstract class BaseRxFragment<T1 extends BaseContract.BasePresenter, T2> extends
        BaseFragment implements OnLoadMoreListener, OnRefreshListener, RecyclerArrayAdapter
        .OnItemClickListener {

    @Inject
    protected T1 mPresenter;

    @Bind(R.id.recycleview)
    protected EasyRecyclerView mEasyRecyclerView;
    protected RecyclerArrayAdapter<T2> mAdapter;

    protected int start = 0;
    protected int limit = 20;

    @Override
    public void attachView() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    protected void initAdapter(boolean refreshable, boolean loadmoreable) {
        if (mEasyRecyclerView != null) {
            mEasyRecyclerView.setLayoutManager(new LinearLayoutManager(getSupportActivity()));
            mEasyRecyclerView.setItemDecoration(ContextCompat.getColor(activity, R.color
                    .common_divider_narrow), 1, 0, 0);
            mEasyRecyclerView.setAdapterWithProgress(mAdapter);
        }

        if (mAdapter != null) {
            mAdapter.setOnItemClickListener(this);
            mAdapter.setError(R.layout.common_error_view).setOnClickListener(new View
                    .OnClickListener() {

                @Override
                public void onClick(View view) {
                    mAdapter.resumeMore();
                }
            });
            if (loadmoreable) {
                mAdapter.setMore(R.layout.common_more_view, this);
                mAdapter.setNoMore(R.layout.common_nomore_view);
            }
            if (refreshable && mEasyRecyclerView != null) {
                mEasyRecyclerView.setRefreshListener(this);
            }
        }
    }

    protected void initAdapter(Class<? extends RecyclerArrayAdapter<T2>> clazz, boolean
            refreshable, boolean loadmoreable) {
        mAdapter = (RecyclerArrayAdapter<T2>) createInstance(clazz);
        initAdapter(refreshable, loadmoreable);
    }

    public Object createInstance(Class<?> cls) {
        Object obj;
        try {
            Constructor c1 = cls.getDeclaredConstructor(Context.class);
            c1.setAccessible(true);
            obj = c1.newInstance(mContext);
        } catch (Exception e) {
            obj = null;
        }
        return obj;
    }

    @Override
    public void onLoadMore() {
    }

    @Override
    public void onRefresh() {
        mAdapter.clear();
        mEasyRecyclerView.setRefreshing(true);
    }

    protected void loaddingError() {
        if (mAdapter.getCount() < 1) { // 说明缓存也没有加载，那就显示errorview，如果有缓存，即使刷新失败也不显示error
            mAdapter.clear();
        }
        mAdapter.pauseMore();
        mEasyRecyclerView.setRefreshing(false);
        mEasyRecyclerView.showTipViewAndDelayClose("似乎没有网络哦");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null)
            mPresenter.detachView();
    }
}



















