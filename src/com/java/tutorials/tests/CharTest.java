package com.java.tutorials.tests;

public class CharTest {

    public void testChar(){

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char c1: " + c1);
        System.out.println("Char c2: " + c2);
        System.out.println("Char c3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.print(Character.toUpperCase(a2));


    }

}
