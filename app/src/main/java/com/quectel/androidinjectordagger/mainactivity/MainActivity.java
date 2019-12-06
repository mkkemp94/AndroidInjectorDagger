package com.quectel.androidinjectordagger.mainactivity;

import android.os.Bundle;
import android.util.Log;

import com.quectel.androidinjectordagger.R;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainView{
    
    @Inject
    MainPresenter mainPresenter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();
        
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, DetailActivity.class));
//            }
//        });
    }
    
    @Override
    public void onMainLoaded() {
        Log.v("TEST", "Main page is loaded.");
    }
}
