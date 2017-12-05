package com.thedeveloperworldisyours.easyrxjava.utilities.scheduler;

import android.support.annotation.NonNull;

import rx.Scheduler;

/**
 * Created by javierg on 29/11/2017.
 */

public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}

