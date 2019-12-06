package com.quectel.androidinjectordagger.di;

import android.app.Application;

import com.quectel.androidinjectordagger.AndroidSampleApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {
    
    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }
    
    void inject(AndroidSampleApp app);
}
