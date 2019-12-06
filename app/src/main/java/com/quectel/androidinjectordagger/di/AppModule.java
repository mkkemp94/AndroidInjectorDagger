package com.quectel.androidinjectordagger.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//@Module(subcomponents = {
//        MainActivityComponent.class,
//        //        DetailActivityComponent.class})
//})

@Module
public class AppModule {
    
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }
    
}
