package com.quectel.androidinjectordagger;

import android.app.Activity;
import android.app.Application;

import com.quectel.androidinjectordagger.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/*
    Original Source:
    https://github.com/iammert/dagger-android-injection/blob/dagger-simplified-with-contributes/app/src/main/java/iammert/com/dagger_android_injection/AndroidSampleApp.java
 */
public class AndroidSampleApp extends Application implements HasActivityInjector {
    
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;
    
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
        
    }
    
    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}