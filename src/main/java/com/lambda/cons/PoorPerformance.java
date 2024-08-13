package com.lambda.cons;

import java.util.List;
import java.util.stream.IntStream;

public class PoorPerformance {

    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10000000).boxed().toList();

        // 일반 for문
        long startTimeByFor = System.nanoTime(); // for문 시작 시간

        int resultByFor = 0;
        for(int i=0; i < list.size(); i++){
            resultByFor += list.get(i);
        }
        long endTimeByFor = System.nanoTime(); // for문 끝난 시간
        long durationTimeSecByFor = endTimeByFor - startTimeByFor;

        // 람다식 stream
        long startTimeByStream = System.nanoTime(); // Stream 시작 시간

        int resultByStream = list.stream().mapToInt(i -> i).sum();

        long endTimeByStream = System.nanoTime(); // Stream 끝난 시간
        long durationTimeSecByStream = endTimeByStream - startTimeByStream;

        System.out.println(list.size() + "번 반복 시 / " + "일반 for문 소요시간 : " + durationTimeSecByFor + " / 결과값: " + resultByFor);
        System.out.println(list.size() + "번 반복 시 / " + "람다식 stream 소요시간 : " + durationTimeSecByStream + " / 결과값: " + resultByStream);
        System.out.println("성능 차이: 약 " + durationTimeSecByStream / durationTimeSecByFor +  "배");
    }
}
