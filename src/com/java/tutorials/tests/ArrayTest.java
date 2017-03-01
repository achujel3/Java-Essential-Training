package com.java.tutorials.tests;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args){

        int[] integers = {1, 6, 3, 8, 5};
        Arrays.sort(integers);
        System.out.println("Integers: ");
        for (int integer : integers) {
            System.out.println(integer);
        }

        String[] strings = {"BAC", "DAS", "NAS", "PLO", "GHT"};
        Arrays.sort(strings);
        System.out.println("Strings: ");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("Sized: ");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i + 12;
            System.out.println(sized[i]);
        }

        System.out.println("Copied: ");
        int[] copied = new int[10];
        System.arraycopy(sized, 5, copied, 1, 4);
        for (int copy : copied) {
            System.out.println(copy);
        }


    }

}
