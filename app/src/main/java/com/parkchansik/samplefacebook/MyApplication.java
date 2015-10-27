package com.parkchansik.samplefacebook;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by dongja94 on 2015-10-27.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
    }
}
