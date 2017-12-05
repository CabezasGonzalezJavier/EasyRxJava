package com.thedeveloperworldisyours.easyrxjava.operation;

import android.support.annotation.NonNull;

import com.thedeveloperworldisyours.easyrxjava.utilities.scheduler.BaseSchedulerProvider;

import rx.subscriptions.CompositeSubscription;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by javierg on 29/11/2017.
 */

public class OperationPresenter implements OperationContract.Presenter {

    @NonNull
    BaseSchedulerProvider mSchedulerProvider;

    @NonNull
    OperationContract.View mView;

    @NonNull
    private CompositeSubscription mSubscriptions;

    public OperationPresenter (@NonNull OperationContract.View view, @NonNull BaseSchedulerProvider schedulerProvider) {

        mView = checkNotNull(view, "view cannot be null");
        mSchedulerProvider = checkNotNull(schedulerProvider, "schedulerProvider cannot be null");
        mSubscriptions = new CompositeSubscription();
        mView.setPresenter(this);
    }

    @Override
    public void fetch() {

    }

    @Override
    public void subscribe() {
        fetch();
    }

    @Override
    public void unSubscribe() {
        mSubscriptions.clear();
    }
}
