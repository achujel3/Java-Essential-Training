package com.java.tutorials.tests;

public class TwoDArrayTest {

    public static void main(String[] args){

        String[][] capitals = new String[3][2];
        capitals[0][0] = "Lithuania";
        capitals[0][1] = "Vilnius";
        capitals[1][0] = "Latvia";
        capitals[1][1] = "Ryga";
        capitals[2][0] = "Estonia";
        capitals[2][1] = "Tallinn";

        for (int i = 0; i < capitals.length; i++) {
            
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The capital of ")
                    .append(capitals[i][0])
                    .append(" is ")
                    .append(capitals[i][1])
                    .append(".");
            System.out.println(stringBuilder);

        }



    }

}
