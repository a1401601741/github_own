package com.example.administrator.github_own.utils;

import android.text.TextUtils;

import com.example.administrator.github_own.GithubApplication;
import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Administrator on 2017/7/24 0024.
 * 统一对Retrofit请求处理
 */

public class RxUtils {

    public static <T> Observable.Transformer<T, T> rxCacheListHelper(final String key) {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable
                        .subscribeOn(Schedulers.io())//指定doOnNext执行线程是新线程
                        .doOnNext(new Action1<T>() {
                            @Override
                            public void call(final T data) {
                                Schedulers.io().createWorker().schedule(new Action0() {
                                    @Override
                                    public void call() {
                                        //通过反射获取List,再判空决定是否缓存
                                        if (data == null)
                                            return;
                                        Class clazz = data.getClass();
                                        Field[] fields = clazz.getFields();
                                        for (Field field : fields) {
                                            String className = field.getType().getSimpleName();
                                            // 得到属性值
                                            if (className.equalsIgnoreCase("List")) {
                                                try {
                                                    List list = (List) field.get(data);
                                                    if (list != null && !list.isEmpty()) {
                                                        ACache.get(GithubApplication.getInstance())
                                                                .put(key, new Gson().toJson(data,
                                                                        clazz));
                                                    }
                                                } catch (IllegalAccessException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                });
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static <T> Observable rxCreateDiskObservable(final String key, final Class<T> clazz) {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                String json = ACache.get(GithubApplication.getInstance()).getAsString(key);
                if (!TextUtils.isEmpty(json)) {
                    subscriber.onNext(json);
                }
                subscriber.onCompleted();
            }
        })
                .map(new Func1<String, T>() {
                    @Override
                    public T call(String s) {
                        return new Gson().fromJson(s, clazz);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

}
