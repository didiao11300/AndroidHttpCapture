/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage.apis;

import capture.request.MyVideoInfoReq;
import netpackage.CommonOkhttpClient;
import netpackage.CommonRequest;
import netpackage.DisposeDataHandle;
import netpackage.DisposeDataListener;
import netpackage.RequestParams;
import okhttp3.Request;

/**
 * Created by youfeimacpro on 2017/5/22.
 */

public class TouTiaoApis {
    //用你自己的服务器替换
    public static final String HOST = "http://192.168.1.102:8080";

    public static void requestToutiaoVideoJson(String url, RequestParams params, DisposeDataListener listener) {
        Request req = CommonRequest.createGetRequest(url, params);
        CommonOkhttpClient.get(req, new DisposeDataHandle(listener));
    }

    public static void sendVideoItemInfoToMyServer(MyVideoInfoReq req, DisposeDataListener listener) {
        String url = HOST + "/VideoInfo";
        Request request = CommonRequest.createPostJsonRequest(url, req.toJsonString());
        CommonOkhttpClient.post(request, new DisposeDataHandle(listener));
    }
}
