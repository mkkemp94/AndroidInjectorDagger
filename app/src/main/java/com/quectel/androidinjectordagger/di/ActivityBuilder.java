package com.quectel.androidinjectordagger.di;

import com.quectel.androidinjectordagger.mainactivity.MainActivity;
import com.quectel.androidinjectordagger.mainactivity.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
    
//    @ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailFragmentProvider.class})
//    abstract DetailActivity bindDetailActivity();

}