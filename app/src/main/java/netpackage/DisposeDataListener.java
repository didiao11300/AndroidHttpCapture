/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

/**
 * Created by tory on 2016/10/25.
 */

public interface DisposeDataListener {
    public void onSuccess(Object reponseObj);

    public void onFailed(Object reasonObj);
}
