package com.lambda.pros;

import java.util.Arrays;
import java.util.List;

class Concise {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // for문 반복
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 람다의 익명 클래스
        fruits.forEach(fruit -> System.out.println(fruit));

        // 람다의 메소드 참조
        fruits.forEach(System.out::println);
    }
}