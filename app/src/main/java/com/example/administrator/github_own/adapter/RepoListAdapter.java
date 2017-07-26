package com.example.administrator.github_own.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.bean.Repos;
import com.example.administrator.github_own.recyclerview.adapter.BaseViewHolder;
import com.example.administrator.github_own.recyclerview.adapter.RecyclerArrayAdapter;
import com.example.administrator.github_own.utils.StringUtils;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class RepoListAdapter extends RecyclerArrayAdapter<Repos> {


    public RepoListAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder<Repos>(parent, R.layout.item_repo) {
            @Override
            public void setData(Repos item) {
                holder.setText(R.id.tv_repo_title, item.getFull_name())
                        .setText(R.id.tv_repo_description, item.getDescription()==null?"":item.getDescription()+"")
                        .setText(R.id.tv_repo_starnumber, item.getForks_count() + "")
                        .setText(R.id.tv_repo_type, item.getLanguage() == null ? "unknown" :
                                item.getLanguage() + "")
                        .setText(R.id.tv_repo_size, StringUtils.getRepoSize(item.getSize()));

            }
        };
    }
}
