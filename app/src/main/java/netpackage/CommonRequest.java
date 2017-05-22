/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

import java.io.File;
import java.util.Map;

import android.util.Log;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by tory on 2016/10/25.
 */

public class CommonRequest {

    private static final MediaType FILE_TYPE = MediaType.parse("application/octet-stream");

    public static Request createGetRequest(String url, RequestParams params) {
        StringBuilder urlBuilder = new StringBuilder(url);
        if (null != params) {
            urlBuilder.append("?");
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                urlBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
        }
        String new_url = new String(urlBuilder);
        if (new_url.endsWith("&")) {
            new_url = urlBuilder.substring(0, urlBuilder.length() - 1);
        }
        Log.i("tory", "createGetRequest()...new_url:" + new_url);
        return new Request.Builder().url(new_url).get().build();
    }

    public static Request createPostRequest(String url, RequestParams params) {
        FormBody.Builder builder = new FormBody.Builder();
        if (null != params) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }
        FormBody body = builder.build();
        return new Request.Builder().url(url).post(body).build();
    }

    public static Request createMultiPostRequest(String url, RequestParams params) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        //设置表单提交
        builder.setType(MultipartBody.FORM);
        if (null != params) {
            for (Map.Entry<String, Object> entry : params.fileParams.entrySet()) {
                if (entry.getValue() instanceof File) {
                    builder.addPart(
                            MultipartBody.Part.createFormData(entry.getKey(),
                                    null,
                                    RequestBody.create(FILE_TYPE, (File) entry.getValue())));
                } else {
                    builder.addFormDataPart(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        return new Request.Builder().url(url).post(builder.build()).build();
    }

}
