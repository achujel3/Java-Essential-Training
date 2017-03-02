package com.java.tutorials.tests;


import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> cities = new HashMap<>();
        cities.put("Lithuania", "Vilnius");
        cities.put("Latvia", "Riga");
        cities.put("Estonia", "Tallinn");

        System.out.println(cities);

        cities.put("Germany", "Berlin");
        System.out.println(cities);

        String myCapital = cities.get("Lithuania");
        System.out.println("My capital city is: " + myCapital);

        cities.remove("Estonia");
        System.out.println(cities);

        cities.clear();
        System.out.println(cities);

    }

}
