package com.lambda.cons;

import java.util.Arrays;
import java.util.List;

public class PoorReadability {

    // 제곱하여 홀수이면 곱하고 짝수이면 더하는 로직
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // for 문 사용
        int resultByFor = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                resultByFor += num * num;
            } else {
                resultByFor *= num * num;
            }
        }

        // 스트림 사용.
        int resultByStream = numbers.stream()
            .map(num -> num * num)
            .reduce(0, (acc, num) -> num % 2 == 0 ? acc + num : acc * num);

        System.out.println(resultByFor);  // 5307868
        System.out.println(resultByStream);  // 5307868
    }
}
