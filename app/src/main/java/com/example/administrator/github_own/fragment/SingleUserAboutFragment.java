package com.example.administrator.github_own.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.github_own.R;
import com.example.administrator.github_own.adapter.UserRepoListAdapter;
import com.example.administrator.github_own.base.BaseRxFragment;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.bean.SingleUser;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.component.DaggerGithubComponent;
import com.example.administrator.github_own.contract.SingleUserAboutContract;
import com.example.administrator.github_own.presenter.SingleUserAboutPresenter;
import com.example.administrator.github_own.recyclerview.adapter.RecyclerArrayAdapter;
import com.example.administrator.github_own.utils.StringUtils;
import com.yuyh.easyadapter.glide.GlideCircleTransform;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/26 0026.
 */

public class SingleUserAboutFragment extends BaseRxFragment<SingleUserAboutPresenter, Repos>
        implements SingleUserAboutContract.View {

    public final static String USER_NAME = "username";

    private String username;

    private HeaderViewHolder headerViewHolder;

    public static SingleUserAboutFragment newInstance(String username) {
        SingleUserAboutFragment fragment = new SingleUserAboutFragment();
        Bundle bundle = new Bundle();
        bundle.putString(USER_NAME, username);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_single_user_about;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerGithubComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void initDatas() {
        username = getArguments().getString(USER_NAME);
    }

    @Override
    public void configViews() {
        initAdapter(UserRepoListAdapter.class, false, false);

        mAdapter.addHeader(new RecyclerArrayAdapter.ItemView() {
            @Override
            public View onCreateView(ViewGroup parent) {
                View headerView = LayoutInflater.from(getActivity()).inflate(R.layout
                        .single_about_header, parent, false);
                return headerView;
            }

            @Override
            public void onBindView(View headerView) {
                headerViewHolder = new HeaderViewHolder(headerView);
            }
        });

        mPresenter.getSingleUserInfoDetail(username);
        mPresenter.getSingleUserRepos(username);
    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void showUserInfoDetail(SingleUser singleUser) {
        Glide.with(getActivity())
                .load(singleUser.getAvatar_url())
                .placeholder(R.drawable.avatar_default)
                .transform(new GlideCircleTransform(getActivity()))
                .into(headerViewHolder.mIvSingleUserHeaderAvatar);

        headerViewHolder.mTvSinleUserHeaderFullname.setText(singleUser.getName());
        headerViewHolder.mTvSingleUserHeaderDate.setText(StringUtils.getUserDate(singleUser
                .getCreated_at()));
        headerViewHolder.mTvSingleUserHeaderFollowers.setText(singleUser.getFollowers()+"");
        headerViewHolder.mTvSingleUserHeaderFollowing.setText(singleUser.getFollowing()+"");
        headerViewHolder.mTvSingleUserHeaderRepos.setText(singleUser.getPublic_repos()+"");
        headerViewHolder.mTvSingleUserHeaderGists.setText(singleUser.getPublic_gists()+"");
    }

    @Override
    public void showSingleUserRepo(List<Repos> reposes, boolean isRefresh) {
        if (isRefresh) {
            mAdapter.clear();
        }
        mAdapter.addAll(reposes);
    }

    @Override
    public void compelte() {
        mEasyRecyclerView.setRefreshing(false);
    }

    @Override
    public void showError() {
        loaddingError();
    }

    static class HeaderViewHolder {
        @Bind(R.id.iv_single_user_header_avatar)
        ImageView mIvSingleUserHeaderAvatar;
        @Bind(R.id.tv_sinle_user_header_fullname)
        TextView mTvSinleUserHeaderFullname;
        @Bind(R.id.tv_single_user_header_date)
        TextView mTvSingleUserHeaderDate;
        @Bind(R.id.tv_single_user_header_followers)
        TextView mTvSingleUserHeaderFollowers;
        @Bind(R.id.tv_single_user_header_following)
        TextView mTvSingleUserHeaderFollowing;
        @Bind(R.id.tv_single_user_header_repos)
        TextView mTvSingleUserHeaderRepos;
        @Bind(R.id.tv_single_user_header_gists)
        TextView mTvSingleUserHeaderGists;

        public HeaderViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }


}
