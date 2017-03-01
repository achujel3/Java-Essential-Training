package com.java.tutorials.tests;

import java.util.Scanner;

public class LoopTest {

    public static void main(String[] args) {

        testingLoops(new String[] {"FirstValue", "SecondValue", "ThirdValue", "FourthValue", "FifthValue", "SixthValue"});
        testingLoops(new String[] {"1", "2", "3"});
        testingLoops(new String[] {"4", "5", "6"});

    }

    public static void testingLoops(String[] arrayOfString) {

        Scanner scanner = new Scanner(System.in);

        for (String value: arrayOfString) {
            System.out.println(value);
        }

    }

}
