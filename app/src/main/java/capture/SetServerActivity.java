/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package capture;

import static capture.ConfigServer.KEY_PORT;
import static capture.ConfigServer.KEY_SERVER;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import cn.darkal.networkdiagnosis.R;

/**
 * Created by youfeimacpro on 2017/5/24.
 */

public class SetServerActivity extends Activity implements View.OnClickListener {
    private EditText mEdittextServer;
    private EditText mEdittextPort;
    public final static String TAG = SetServerActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setserver);
        mEdittextServer = (EditText) findViewById(R.id.ed_server);
        mEdittextPort = (EditText) findViewById(R.id.ed_port);
        findViewById(R.id.btn_save_server).setOnClickListener(this);
        findViewById(R.id.btn_save_port).setOnClickListener(this);
        mEdittextServer.setText(ConfigServer.getServer());
        mEdittextPort.setText(ConfigServer.getPort());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_save_server:
                if (!TextUtils.isEmpty(mEdittextServer.getText())) {
                    ConfigServer.savePrefrence(KEY_SERVER, mEdittextServer.getText().toString());
                } else {
                    Toast.makeText(this, "server is empty!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_save_port:
                if (!TextUtils.isEmpty(mEdittextPort.getText())) {
                    ConfigServer.savePrefrence(KEY_PORT, mEdittextPort.getText().toString());
                } else {
                    Toast.makeText(this, "port is empty!", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }


}
