package com.java.tutorials.tests.testingInstanceVariableStoring;

import com.java.tutorials.tests.testingInstanceVariableStoring.model.Olive;
import com.java.tutorials.tests.testingInstanceVariableStoring.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class testingInstanceVariables {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
        OlivePress olivePress = new OlivePress();
        int totalOil = olivePress.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}
