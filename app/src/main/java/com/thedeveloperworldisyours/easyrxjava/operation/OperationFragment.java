package com.thedeveloperworldisyours.easyrxjava.operation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.easyrxjava.R;

import butterknife.ButterKnife;

/**
 * Created by javierg on 28/11/2017.
 */

public class OperationFragment extends Fragment implements OperationContract.View{

    OperationContract.Presenter mPresenter;
    public OperationFragment() {
        // Required empty public constructor
    }
    public static OperationFragment newInstance() {

        return new OperationFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.operation_fragment, container, false);
        ButterKnife.bind(this, view);

        mPresenter.subscribe();

        return view;
    }

    @Override
    public void setPresenter(OperationContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showError() {

    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }
}
