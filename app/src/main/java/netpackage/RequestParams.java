/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tory on 2016/10/25.
 */

public class RequestParams {
    //ConcurrentHashMap 使用了分段锁来实现线程安全
    public ConcurrentHashMap<String, String> urlParams = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Object> fileParams = new ConcurrentHashMap<>();

    public RequestParams() {
        this(null);
    }

    //entrySet用于去所有的值，也可以用iterator；
    //否则只能用key value来取值
    public RequestParams(Map<String, String> source) {
        if (null != source) {
            for (Map.Entry<String, String> entry : source.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                put(key, value);
            }
        }
    }

    public void put(String key, Object value) {
        if (value instanceof String) {
            urlParams.put(key, (String) value);
        } else {
            fileParams.put(key, value);
        }
    }
}
