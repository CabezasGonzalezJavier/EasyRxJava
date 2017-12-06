package com.thedeveloperworldisyours.easyrxjava.data;

import java.util.ArrayList;

/**
 * Created by javiergonzalezcabezas on 6/12/17.
 */

public class DataToCalculate extends BasicData{

    private ArrayList<Integer> mValues = new ArrayList<>();

    public DataToCalculate(Action action) {
        super(action);
    }

    public void addValue(Integer value)
    {
        mValues.add(value);
    }

    public ArrayList<Integer> getValues() {
        return mValues;
    }
}

