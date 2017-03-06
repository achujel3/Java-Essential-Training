package com.java.tutorials.tasks;

import java.util.Scanner;

/**
 * This is a second calculator app from the course "Java Essentials"
 */
public class Calculator2 {

    public static void main(String[] args) {

        Calculator2 calculator2 = new Calculator2();
        calculator2.calculate();

    }

    /**
     * This is a method which is doing calculation
     */
    public void calculate() {

        InputHelper inputHelper = new InputHelper();
        String firstNumber = inputHelper.getInput("Write first number: ");
        String secondNumber = inputHelper.getInput("Write second number: ");
        String action = inputHelper.getInput("What action you want to do ( + - * /): ");

        while (!firstNumber.equals("0") || !secondNumber.equals("0") || !action.equals("0")) {
            try {
                switch (action) {
                    case "+":
                        System.out.println("The result is: " + (Double.valueOf(firstNumber) + Double.valueOf(secondNumber)));
                        break;
                    case "-":
                        System.out.println("The result is: " + (Double.valueOf(firstNumber) - Double.valueOf(secondNumber)));
                        break;
                    case "*":
                        System.out.println("The result is: " + (Double.valueOf(firstNumber) * Double.valueOf(secondNumber)));
                        break;
                    case "/":
                        System.out.println("The result is: " + (Double.valueOf(firstNumber) / Double.valueOf(secondNumber)));
                        break;
                    default:
                        System.out.println("You've entered a wrong action!");
                }
            } catch (NumberFormatException e) {
                System.out.println("You've entered not a number!");
            }

            firstNumber = inputHelper.getInput("Write first number: ");
            secondNumber = inputHelper.getInput("Write second number: ");
            action = inputHelper.getInput("What action you want to do ( + - * /): ");

        }
    }


    class InputHelper {
        public String getInput(String prompt) {
            System.out.println(prompt);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
    }


}
