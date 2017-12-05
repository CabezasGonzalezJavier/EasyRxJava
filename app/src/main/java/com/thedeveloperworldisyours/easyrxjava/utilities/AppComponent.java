package com.thedeveloperworldisyours.easyrxjava.utilities;

import com.thedeveloperworldisyours.easyrxjava.OperationActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by javierg on 29/11/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(OperationActivity operationActivity);

}
