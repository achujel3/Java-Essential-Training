package com.java.tutorials.tasks;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String firstNumber = scanner.next();

        System.out.println("Enter a numeric value: ");
        String secondNumber = scanner.next();

        double sum = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);

        System.out.println("The answer is: " + sum);
    }



}
