package com.java.tutorials.tests;

import java.util.Scanner;

public class StringTest {

    public String type;

    public StringTest(){
        this.type = "No type";
    }

    public void displayType(){
        System.out.println("The type is: " + this.type);
    }

    public String getStringFromArrayOfChars(char[] chars){
        // This wouldn't work and return pointer
//        return chars.toString();
        return new String(chars);
    }

    public void testingStringBuilder(){

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);

    }

}
