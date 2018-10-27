package com.example.anupamprakash.nitw;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("ProductSans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
