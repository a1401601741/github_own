package com.example.administrator.github_own.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.google.gson.internal.$Gson$Preconditions.checkNotNull;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class ActivityUtils {
    public static void addAndShowFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                                    @NonNull Fragment showFragment,
                                                    Fragment hideFragment,
                                                    @NonNull String tag,
                                                    int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(showFragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (hideFragment != null) {
            transaction.hide(hideFragment);
        }
        transaction.add(frameId, showFragment, tag);
        transaction.show(showFragment);
        transaction.commit();
    }

    public static void replaceAndShowFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                                        @NonNull Fragment showFragment,
                                                        Fragment hideFragment,
                                                        @NonNull String tag,
                                                        int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(showFragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (hideFragment != null) {
            transaction.hide(hideFragment);
        }
        transaction.replace(frameId, showFragment, tag);
//        transaction.show(showFragment);
        transaction.commit();
    }


}
