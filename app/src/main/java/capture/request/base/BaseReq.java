/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture.request.base;

import com.alibaba.fastjson.JSON;

/**
 * Created by youfeimacpro on 2016/10/31.
 */
//基本的请求全结构体；一般用body就行，用到父亲的token等才直接使用
public class BaseReq {
    public String action;
    public String token;
    public String env;
    public BaseReqBody body;

    public String toJsonString() {
        String s = JSON.toJSONString(this);
        return s;
    }
}
