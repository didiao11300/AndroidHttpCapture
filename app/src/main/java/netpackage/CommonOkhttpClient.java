/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by tory on 2016/10/25.
 * 发送get post 请求
 */

public class CommonOkhttpClient {
    private static OkHttpClient mOkHttpClient;
    private static final int TIME_OUT = 30;

    static {
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        okHttpBuilder.connectTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpBuilder.readTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpBuilder.writeTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpBuilder.followRedirects(true);
        //        okHttpBuilder.sslSocketFactory()
        mOkHttpClient = okHttpBuilder.build();
    }

    public static void post(Request request, DisposeDataHandle handle) {
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new CommonJsonCallback(handle));
    }

    public static void get(Request request, DisposeDataHandle handle) {
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new CommonJsonCallback(handle));
    }
}
