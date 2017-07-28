package com.example.administrator.github_own.utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class StringUtils {

    public static String creatAcacheKey(Object... param) {
        String key = "";
        for (Object o : param) {
            key += "-" + o;
        }
        return key.replaceFirst("-","");
    }

    public static String getRepoSize(int size) {
        if (size < 1024) {
            return String.valueOf(size) + "KB";
        } else {
            return String.valueOf(size / 1000) + "MB";
        }
    }

    public static String getUserSearchPars(String username) {
        Log.i("userPar", username + "+repos:%3E42+followers:%3E500");
        return username + "+repos:%3E42+followers:%3E500";
    }

    public static String getUserDate(String originDate) {
        String midle = originDate.substring(0, 10);
        String[] dates = midle.split("-");
        return "Member since "+dates[0]+"年 "+dates[1]+"月 "+dates[2]+"日";
    }

}
