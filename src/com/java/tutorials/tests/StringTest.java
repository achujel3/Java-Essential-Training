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

    public void matching(boolean bool){
        if(bool){
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }
    }

    public void testStringMethods(){

        String s1 = "Welcome to California!";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("California");
        System.out.println("Position of substring: " + position);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!                   ";
        int len1 = s2.length();
        System.out.println(len1);
        String s3 = s2.trim();
        System.out.println(s3.length());

    }

}
