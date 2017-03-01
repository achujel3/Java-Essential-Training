package com.java.tutorials.tests;

import java.math.BigDecimal;
import java.util.Scanner;

public class MethodOverloadingTest {

    public static void main(String[] args){

        String s1 = getInput("Write first number: ");
        String s2 = getInput("Write second number: ");
        String s3 = getInput("Write third number: ");

        getSum(s1, s2);
        getSum(s1, s2, s3);
        getSum(s1, s2, s3, s1, s2, s3);

    }

    static String getInput(String prompt){

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    static void getSum(String s1, String s2) {
        System.out.print("First method. ");
        Double number1 = Double.valueOf(s1);
        Double number2 = Double.valueOf(s2);
        Double result = number1 + number2;
        System.out.println("The sum is: " + result);
    }

    static void getSum(String s1, String s2, String s3) {
        System.out.print("Second method. ");
        Double number1 = Double.valueOf(s1);
        Double number2 = Double.valueOf(s2);
        Double number3 = Double.valueOf(s3);
        Double result = number1 + number2 + number3;
        System.out.println("The sum is: " + result);
    }


    // 9.6
    // 5.4
    // 8.2
    static void getSum(String ... numbers){
        System.out.print("Third method. ");
        BigDecimal result = new BigDecimal("0");
        for (String number: numbers) {
             result = result.add(new BigDecimal(number));
        }
        System.out.println("The sum is: " + result);
    }

}
