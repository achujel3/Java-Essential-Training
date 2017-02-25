package com.java.tutorials.tests;

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

}
