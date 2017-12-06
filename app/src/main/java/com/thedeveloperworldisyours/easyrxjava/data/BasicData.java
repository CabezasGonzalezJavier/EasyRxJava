package com.thedeveloperworldisyours.easyrxjava.data;

/**
 * Created by javiergonzalezcabezas on 6/12/17.
 */

public abstract class BasicData {
    protected Action mAction;

    public BasicData(Action action) {
        mAction = action;
    }

    public void setAction(Action action) {
        mAction = action;
    }

    public Action getAction() {
        return mAction;
    }
}
