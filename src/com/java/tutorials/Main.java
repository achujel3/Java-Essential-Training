package com.java.tutorials;

import com.java.tutorials.tests.NumberFormatTest;
import com.java.tutorials.tests.StringTest;

public class Main {

    public static void main(String[] args) {

        StringTest stringTest = new StringTest();
        String str1 = "Hello";
        String str2 = "Hello";
        stringTest.matching(str1.equals(str2));

        NumberFormatTest numberFormatTest = new NumberFormatTest();
        numberFormatTest.testLocale();

    }
}
