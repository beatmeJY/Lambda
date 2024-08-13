package com.lambda.pros;

import java.util.Arrays;
import java.util.List;

public class Parallel {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 순차 스트림
        int sumSequential = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        // 병렬 스트림
        int sumParallel = numbers.parallelStream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("순차 처리 결과: " + sumSequential); // 30
        System.out.println("병렬 처리 결과: " + sumParallel); // 30
    }
}
