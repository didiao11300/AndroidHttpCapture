/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture.response.base;

/**
 * Created by youfeimacpro on 2017/5/22.
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by youfeimacpro on 2016/11/1.
 */
public class BaseRsp {
    @JSONField(serialize = true)
    protected int code;
    @JSONField(serialize = true)
    protected String message;
    @JSONField(serialize = true)
    protected String action;
    @JSONField(serialize = true)
    protected Object data;

    public String toJsonString() {
        String s = JSON.toJSONString(this);
        return s;
    }
}
