/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

/**
 * Created by tory on 2016/10/25.
 */

public interface DisposeDataListener {
    // FIXME: 2017/5/21 这里应该根据mClass返回类型
    public void onSuccess(Object reponseObj);

    public void onFailed(Object reasonObj);
}
