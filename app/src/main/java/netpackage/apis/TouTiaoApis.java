/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage.apis;

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
    public static void requestToutiaoVideoJson(String url, RequestParams params, DisposeDataListener listener) {
        Request req = CommonRequest.createGetRequest(url, params);
        CommonOkhttpClient.get(req, new DisposeDataHandle(listener));
    }
}
