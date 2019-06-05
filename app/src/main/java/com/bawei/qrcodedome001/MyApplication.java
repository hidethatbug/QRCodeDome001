package com.bawei.qrcodedome001;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Author:程金柱
 * Date:2019/6/5 19:40
 * Description：
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(getApplicationContext());
    }
}
