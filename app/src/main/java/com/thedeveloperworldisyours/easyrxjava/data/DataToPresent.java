package com.thedeveloperworldisyours.easyrxjava.data;

/**
 * Created by javiergonzalezcabezas on 6/12/17.
 */

public class DataToPresent extends BasicData{

    private boolean mIsErrorOccurred = false;
    private Float mResult;

    public DataToPresent(Action action, Float result, boolean isErrorOccurred) {
        super(action);
        mResult = result;
        mIsErrorOccurred = isErrorOccurred;
    }

    public Float getResult() {
        return mResult;
    }

    public boolean isLegit() {
        return !mIsErrorOccurred;
    }
}

