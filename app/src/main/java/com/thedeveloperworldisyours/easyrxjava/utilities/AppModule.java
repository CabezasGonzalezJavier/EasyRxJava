package com.thedeveloperworldisyours.easyrxjava.utilities;

import com.thedeveloperworldisyours.easyrxjava.OperationApplication;
import com.thedeveloperworldisyours.easyrxjava.utilities.scheduler.BaseSchedulerProvider;
import com.thedeveloperworldisyours.easyrxjava.utilities.scheduler.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by javierg on 29/11/2017.
 */
@Module
public class AppModule {

    OperationApplication mOperationApplication;

    public AppModule(OperationApplication operationApplication) {
        mOperationApplication = operationApplication;
    }


    @Singleton
    @Provides
    BaseSchedulerProvider provideSchedulerProvider() {
        return new SchedulerProvider();
    }
}
