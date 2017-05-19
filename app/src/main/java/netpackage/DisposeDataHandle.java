/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

/**
 * Created by tory on 2016/10/25.
 */

public class DisposeDataHandle {
    public DisposeDataListener mListener;
    public Class<?> mClass = null;

    public DisposeDataHandle(DisposeDataListener listener) {
        mListener = listener;
    }

    public DisposeDataHandle(DisposeDataListener listener, Class<?> clazz) {
        mListener = listener;
        mClass = clazz;
    }
}
