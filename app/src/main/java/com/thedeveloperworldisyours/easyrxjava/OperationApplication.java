package com.thedeveloperworldisyours.easyrxjava;

import android.app.Application;

import com.thedeveloperworldisyours.easyrxjava.utilities.AppComponent;
import com.thedeveloperworldisyours.easyrxjava.utilities.AppModule;
import com.thedeveloperworldisyours.easyrxjava.utilities.DaggerAppComponent;

/**
 * Created by javierg on 29/11/2017.
 */

public class OperationApplication extends Application{

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

}
