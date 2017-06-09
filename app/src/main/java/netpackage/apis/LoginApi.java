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
 * Created by youfeimacpro on 2016/11/30.
 */

public class LoginApi {

    /**
     * 业务:登录系统
     */
    //    public static void login(String user, String passwd, DisposeDataListener listener) {
    //        //这里应该改成url地址传入
    //        String url = "/user/json1";
    //        // FIXME: 2016/11/30
    //        RequestParams params = new RequestParams();
    //        params.put("action", "post");
    //        params.put("env", "staging");
    //        params.put("token", "token");
    //        com.alibaba.fastjson.JSONObject jb = new com.alibaba.fastjson.JSONObject();
    //        jb.put("user", user);
    //        jb.put("passwd", passwd);
    //        Log.i("tory", jb.toJSONString());
    //        params.put("body", jb.toJSONString());
    //        CommonOkhttpClient.post(CommonRequest.createPostRequest(Constants.PATH + url, params), new
    // DisposeDataHandle
    //                (listener));
    //    }

    /**
     * 业务:检查是否登录
     */
    //    public static void checkLogin(String uid, DisposeDataListener listener) {
    //        //这里应该改成url地址传入
    //        String url = "/user/checkLogin";
    //        // FIXME: 2016/11/30
    //        RequestParams params = new RequestParams();
    //        UserReq user = new UserReq();
    //        user.uid = "110350649";
    //        user.nick_name = "tory";
    //        user.getParent().action = "post";
    //        user.getParent().env = "staging";
    //        user.getParent().token = "tks";
    //        params.put("data", user.toJsonString());
    //        Log.i("tory", user.toJsonString());
    //        // FIXME: 2016/12/3 下次把okhttp换了,这里param不太爽
    //        CommonOkhttpClient.post(CommonRequest.createPostRequest(Constants.PATH + url, params), new
    // DisposeDataHandle
    //                (listener));
    //    }
    public void register(String user, String passwd, DisposeDataListener listener) {

    }
}
