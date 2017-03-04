package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olives) {

        int totalOil = 0;
        for (Olive olive : olives) {
            totalOil += olive.crush();
        }
        return totalOil;

    }

}
