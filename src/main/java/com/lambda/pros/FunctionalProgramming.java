package com.lambda.pros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming {

    public static void main2(String[] args) {
        List<String> fruits = List.of("banana", "apple", "cherry");
        List<String> sortedData = new ArrayList<>(fruits);

        sortedData.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(sortedData);
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "apple", "cherry");

        List<String> sortedData = fruits.stream().sorted(String::compareTo).toList();
        System.out.println(sortedData);
    }
}
