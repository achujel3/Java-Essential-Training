package com.java.tutorials.tests;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args){

        List<String> cities = new ArrayList<>();

        cities.add("Vilnius");
        cities.add("Klaipėda");
        cities.add("Kaunas");
        cities.add("Šiauliai");

        System.out.println(cities);

        cities.add("Panevėžys");
        System.out.println(cities);

        cities.remove(0);
        System.out.println(cities);

        String myCity = cities.get(0);
        System.out.println("My city: " + myCity);

        int pos = cities.indexOf("Šiauliai");
        System.out.println("The index of Šiauliai is " + ++pos);

    }

}
