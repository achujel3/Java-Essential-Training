package com.java.tutorials.tests;

import java.math.BigDecimal;

public class NumericTest {



    public void testingPrimitives(){
        int int1 = 10;
        short short1 = 10;
        long long1 = 10L;
        double double1 = 10.0d;
        float float1 = 10.0f;
        System.out.println(int1);
        System.out.println(short1);
        System.out.println(long1);
        System.out.println(double1);
        System.out.println(float1);
    }

    public void testingHelperClasses(){

        Integer int1 = new Integer(10);
        Short short1 = 10;
        Long long1 = new Long(10);
        Double double1 = new Double(10.0);
        Float float1 = new Float(10.0);
        System.out.println(int1);
        System.out.println(short1);
        System.out.println(long1);
        System.out.println(double1);
        System.out.println(float1);

        Integer max = Integer.MAX_VALUE;
        max++;
        System.out.println(max);

    }

    public void testBigDecimal(){

        double value = .012;
        double pSum = value + value + value;
        // Wrong sum:
        System.out.println("Sum: " + pSum);

        String strValue = Double.toString(value);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        // Correct sum:
        System.out.println("Sum: " + bSum);

    }

}
