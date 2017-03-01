package com.java.tutorials.tests;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args){
        SwitchTest switchTest = new SwitchTest();
        switchTest.testingSwitch();
    }

    public void testingSwitch(){

        System.out.println("Write a number between 1 and 3 (0 to end): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!(input).equals("0")) {

            int intSwitch = Integer.valueOf(input);

            switch (intSwitch){
                case 1:
                    System.out.println("You've written 1");
                    break;
                case 2:
                    System.out.println("You've written 2");
                    break;
                case 3:
                    System.out.println("You've written 3");
                    break;
                default:
                    System.out.println("The number is more than 3 ar less than 1");
            }

            input = scanner.nextLine();
        }

    }

}
