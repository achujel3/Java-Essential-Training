package com.java.tutorials;

import com.java.tutorials.tests.MemoryTest;
import com.java.tutorials.tests.NumericTest;

public class Main {

    public static void main(String[] args) {
        NumericTest numericTest = new NumericTest();
        numericTest.testingPrimitives();
        numericTest.testingHelperClasses();

        MemoryTest memoryTest = new MemoryTest();
        memoryTest.testRuntimeMemory();
    }
}
