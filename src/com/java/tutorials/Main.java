package com.java.tutorials;

import com.java.tutorials.tests.BooleanTest;
import com.java.tutorials.tests.MathTest;
import com.java.tutorials.tests.MemoryTest;
import com.java.tutorials.tests.NumericTest;

public class Main {

    public static void main(String[] args) {
        NumericTest numericTest = new NumericTest();
        //        numericTest.testingPrimitives();
        //        numericTest.testingHelperClasses();
//        numericTest.testBigDecimal();

        MemoryTest memoryTest = new MemoryTest();
//        memoryTest.testRuntimeMemory();

        MathTest mathTest = new MathTest();
//        mathTest.testMathClass();

        BooleanTest booleanTest = new BooleanTest();
        booleanTest.testBooleanValues();
    }
}
