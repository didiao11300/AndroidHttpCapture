/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package netpackage;

/**
 * Created by tory on 2016/10/25.
 */

public class OkHttpException extends Exception {
    private int ecode;
    private Object emsg;

    public OkHttpException(int ecode, Object emsg) {
        this.ecode = ecode;
        this.emsg = emsg;
    }

    public int getEcode() {
        return ecode;
    }

    public Object getEmsg() {
        return emsg;
    }

    @Override
    public String toString() {
        return "ecode:" + ecode + " emsg:" + emsg;
    }
}
