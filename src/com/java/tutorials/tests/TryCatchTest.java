package com.java.tutorials.tests;

import java.util.Scanner;

public class TryCatchTest {

    public static void main(String[] args) {

        String welcome = "Welcome";
        System.out.println(welcome.length());
        char[] chars = welcome.toCharArray();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        while (!input.equals("0")) {
            try {
                char lastChar = chars[Integer.valueOf(input)];
                System.out.println(lastChar);

                String sub = welcome.substring(Integer.valueOf(input));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String index out of bound");
            }
            input = scanner.next();
        }

    }

}
