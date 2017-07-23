package com.example.administrator.github_own.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by asus on 2017/7/23.
 */

public class NetworkUtils {

    /**
     * 判断网络是否可用
     */
    public static boolean isAvailable(Context context) {
        NetworkInfo info = getActiveNetworkInfo(context);
        return info != null && info.isAvailable();
    }

    /**
     * 获取可用网络信息
     *
     * @param context
     * @return
     */
    private static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context
                .CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }
}
