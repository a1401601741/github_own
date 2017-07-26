package com.example.administrator.github_own.adapter;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.bean.CompositeUser;
import com.example.administrator.github_own.recyclerview.adapter.BaseViewHolder;
import com.example.administrator.github_own.recyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class UserListAdapter extends RecyclerArrayAdapter<CompositeUser> {


    public UserListAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new BaseViewHolder<CompositeUser>(parent, R.layout.item_user) {
            @Override
            public void setData(CompositeUser item) {
                Log.i("avatar_url", item.getAvatar_url());
                holder.setCircleImageUrl(R.id.iv_user_avatar, item.getAvatar_url(), R.drawable
                        .avatar_default)
                        .setText(R.id.tv_user_followers, item.getFollows()+" "+"follows")
                        .setText(R.id.tv_user_name, item.getName())
                        .setText(R.id.tv_user_repos,item.getRepos()+" "+"repos");

            }
        };
    }
}
