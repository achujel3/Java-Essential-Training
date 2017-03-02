package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class testingInstanceVariables {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        olives.add(olive1);
        Olive olive2 = new Olive();
        olives.add(olive2);
        Olive olive3 = new Olive();
        olives.add(olive3);

        OlivePress olivePress = new OlivePress();
        olivePress.getOil(olives);

    }

}
