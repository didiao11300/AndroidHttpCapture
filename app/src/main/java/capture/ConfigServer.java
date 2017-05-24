/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import cn.darkal.networkdiagnosis.SysApplication;
import netpackage.apis.TouTiaoApis;

/**
 * Created by youfeimacpro on 2017/5/24.
 */

public class ConfigServer {
    public final static String TAG = ConfigServer.class.getSimpleName();

    public final static String DEF_PORT = "8080";
    public final static String DEF_SERVER = "192.168.1.102";
    public final static String KEY_SERVER = "key_server";
    public final static String KEY_PORT = "key_port";

    public static void savePrefrence(String key, String value) {
        SharedPreferences sp = SysApplication.sAppContext.getSharedPreferences(TAG, MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString(key, value);
        ed.apply();
    }

    public static String getPrefrence(String key, String def) {
        SharedPreferences sp = SysApplication.sAppContext.getSharedPreferences(TAG, MODE_PRIVATE);
        return sp.getString(key, def);
    }

    public static String getPort() {
        return getPrefrence(KEY_PORT, DEF_PORT);
    }

    public static String getServer() {
        return getPrefrence(KEY_SERVER, DEF_SERVER);
    }
}
