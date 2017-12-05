package com.thedeveloperworldisyours.easyrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thedeveloperworldisyours.easyrxjava.operation.OperationFragment;
import com.thedeveloperworldisyours.easyrxjava.operation.OperationPresenter;
import com.thedeveloperworldisyours.easyrxjava.utilities.scheduler.BaseSchedulerProvider;
import com.thedeveloperworldisyours.easyrxjava.utilities.scheduler.SchedulerProvider;

import javax.inject.Inject;

import static com.thedeveloperworldisyours.easyrxjava.utilities.Utils.addFragmentToActivity;

public class OperationActivity extends AppCompatActivity {

    @Inject
    BaseSchedulerProvider mSchedulerProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operation_activity);

        initDagger();
        initFragmentAndPresenter();
    }

    public void initDagger() {
        OperationApplication application = (OperationApplication) getApplication();
        application.getAppComponent().inject(this);
    }

    public void initFragmentAndPresenter() {
        OperationFragment operationFragment = (OperationFragment) getSupportFragmentManager().findFragmentById(R.id.oparation_contenier);

        if (operationFragment == null) {
            operationFragment = operationFragment.newInstance();
            addFragmentToActivity(getSupportFragmentManager(), operationFragment, R.id.oparation_contenier);
        }

        new OperationPresenter(operationFragment, mSchedulerProvider);
    }

}
