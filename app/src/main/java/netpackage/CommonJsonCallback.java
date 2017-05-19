/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

import java.io.IOException;

import org.json.JSONObject;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by tory on 2016/10/25.
 */

public class CommonJsonCallback implements Callback {
    private static String TAG = CommonJsonCallback.class.getSimpleName();
    private DisposeDataListener mListener;
    private Class<?> mClass;
    private Handler mDelierHandler;
    protected final String RESULT_CODE = "code";
    protected final String RESULT = "data";
    protected final int NETWORK_ERROR = -1;
    protected final int JSON_ERROR = -2;
    protected final int REQUEST_OK = 0;

    @Override
    public void onFailure(final Call call, final IOException e) {
        mDelierHandler.post(new Runnable() {
            @Override
            public void run() {
                mListener.onFailed(e);
            }
        });
    }

    @Override
    public void onResponse(final Call call, final Response response) throws IOException {
        final int code = response.code();
        Log.i("tory", "onResponse()..." + response.toString());
        if (200 != code) {
            mDelierHandler.post(new Runnable() {
                @Override
                public void run() {
                    mListener.onFailed(new OkHttpException(code, "error"));
                }
            });
            return;
        }
        final String result = response.body().string();
        mDelierHandler.post(new Runnable() {
            @Override
            public void run() {
                handleResponse(result);
            }
        });
    }

    public CommonJsonCallback(DisposeDataHandle handle) {
        mListener = handle.mListener;
        mClass = handle.mClass;
        mDelierHandler = new Handler(Looper.getMainLooper());
    }

    private void handleResponse(String resutl) {
        if (TextUtils.isEmpty(resutl)) {
            mListener.onFailed(new OkHttpException(NETWORK_ERROR, 5));
            return;
        }

        // FIXME: 2016/10/31 tory 这里 需要处理,用fastjson强转
        try {
            Log.i(TAG, "handleResponse()..." + resutl);
            JSONObject retJson = new JSONObject(resutl);
            if (retJson.has(RESULT)) {
                String data = retJson.optString(RESULT);
                if (retJson.optInt(RESULT_CODE) == REQUEST_OK) {
                    //                            if (null == mClass) {
                    //                                mListener.onFailed(retJson);
                    //                            } else {
                    //                                Object obj = null;
                    //                                if (null == obj) {
                    //                                    mListener.onFailed(obj);
                    //                                } else {
                    //                                    //按照classz解析json开始解析json fastjson 或则其他
                    //                                    //                            JSONObject jb = new
                    // JSONObject(retJson,);
                    //
                    //                                    mListener.onSuccess(null);
                    //                                }
                    //                            }
                    mListener.onSuccess(retJson.opt("data"));
                } else {
                    mListener.onFailed(new OkHttpException(JSON_ERROR, -1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            mListener.onFailed(new OkHttpException(JSON_ERROR, -2));
        }
    }
}
