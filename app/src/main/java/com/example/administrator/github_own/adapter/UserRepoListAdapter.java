package com.example.administrator.github_own.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.recyclerview.adapter.BaseViewHolder;
import com.example.administrator.github_own.recyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by Administrator on 2017/7/27 0027.
 */

public class UserRepoListAdapter extends RecyclerArrayAdapter<Repos> {


    public UserRepoListAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder<Repos>(parent, R.layout.layout_single_user_repos) {
            @Override
            public void setData(Repos item) {
                holder.setText(R.id.tv_single_user_repos_title, item.getFull_name())
                        .setText(R.id.tv_single_user_repos_desicription, item.getDescription() ==
                                null ? "" : item.getDescription() + "")
                        .setText(R.id.tv_single_user_repos_forks, item.getForks_count() + "")
                        .setText(R.id.tv_single_user_repos_followers, item.getStargazers_count()
                                + "");


            }
        };

    }
}
