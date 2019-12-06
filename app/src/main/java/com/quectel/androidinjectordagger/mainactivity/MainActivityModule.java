package com.quectel.androidinjectordagger.mainactivity;

import com.quectel.androidinjectordagger.data.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    
    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }
    
    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }
}