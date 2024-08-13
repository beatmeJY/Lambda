package com.lambda.cons;

import java.util.Arrays;
import java.util.List;

public class DifficultDebugging {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0);

        // 스트림 사용.
        numbers.stream().map(f -> f / f).toList();
    }
}
