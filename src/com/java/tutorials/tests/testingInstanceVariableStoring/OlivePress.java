package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;

import java.util.List;

public class OlivePress implements Press {

    private int currentOil;

    public int getOil(List<Olive> olives) {

        int totalOil = currentOil;
        for (Olive olive : olives) {
            totalOil += olive.crush();
        }
        return totalOil;

    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }

}
