package com.java.tutorials.tests;


import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {

        System.out.println("Ordered data: ");
        List<String> list = new ArrayList<>();
        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Klaipėda");
        list.add("Šiauliai");
        System.out.println(list);
        System.out.println();

        System.out.println("Iterator: ");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println();

        System.out.println("For each: ");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("Java 8 method reference: ");
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Unordered data: ");
        Map<String, String> map = new HashMap<>();
        map.put("Lithuania", "Vilnius");
        map.put("Latvia", "Riga");
        map.put("Estonia", "Tallinn");
        map.put("Germany", "Berlin");
        System.out.println(map);
        System.out.println();

        System.out.println("HashMap iterator: ");
        Set<String> keys = map.keySet();
        Iterator<String> hashIterator = keys.iterator();
        while(hashIterator.hasNext()) {
            String key = hashIterator.next();
            System.out.println("The capital of " + key + " is " + map.get(key));
        }
        System.out.println();

        System.out.println("HashMap for each: ");
        for (String value : keys) {
            System.out.println("The capital of " + value + " is " + map.get(value));
        }

    }



}
