package com.uriah.smarthomecare;


import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.uriahsolution.homecare.BuildConfig;

import timber.log.Timber;


/**
 * Created by Uriah Solution Pvt Ltd on 24-03-2018.
 */

public class MyApp extends Application {




    public static MyApp get(Context context) {
        return (MyApp) context.getApplicationContext();
    }



    @Override
    public void onCreate() {
        super.onCreate();

        //Timber
        if (BuildConfig.DEBUG)
            Timber.plant(new Timber.DebugTree());

        }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
