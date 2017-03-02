package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olives) {

        for (Olive olive : olives) {
            System.out.println(olive.name);
        }
        return 0;

    }

}
