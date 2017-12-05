package com.thedeveloperworldisyours.easyrxjava.operation;

import com.thedeveloperworldisyours.easyrxjava.utilities.BasePresenter;
import com.thedeveloperworldisyours.easyrxjava.utilities.BaseView;

/**
 * Created by javierg on 29/11/2017.
 */

public class OperationContract {

    public interface Presenter extends BasePresenter {

        void fetch();

    }

    interface View extends BaseView<Presenter> {

        void showError();

        void setLoadingIndicator(boolean active);

    }
}
