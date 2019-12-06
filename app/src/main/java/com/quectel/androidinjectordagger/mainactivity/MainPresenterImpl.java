package com.quectel.androidinjectordagger.mainactivity;

import com.quectel.androidinjectordagger.data.ApiService;

import javax.inject.Inject;

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ApiService apiService;
    
    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }
    
    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}