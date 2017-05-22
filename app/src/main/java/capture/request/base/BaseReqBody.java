/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture.request.base;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by youfeimacpro on 2016/10/31.
 */
public class BaseReqBody {

    @JSONField(serialize = false,deserialize = false)
    protected BaseReq parent;


    public BaseReqBody(){
        parent = new BaseReq();
    }

    @JSONField(serialize = false,deserialize = false)
    @Override
    public String toString() {
        return toJsonString();
    }

    @JSONField(serialize = false,deserialize = false)
    public BaseReq getParent() {
        return parent;
    }

    @JSONField(serialize = false,deserialize = false)
    public String toJsonString(){
        this.parent.body = this;
        return this.parent.toJsonString();
    }

}
