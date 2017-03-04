package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Kalamata;
import com.java.tutorials.tests.testingInstanceVariableStoring.model.Ligurian;
import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class testingInstanceVariables {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press olivePress = new OlivePress();
        olivePress.setOil(25);
        int totalOil = olivePress.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil.");

    }

}
