package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] numbers) {
           IntStream.range(numbers[0],numbers[numbers.length]).forEach(System.out::println);
        System.out.println(IntStream.range(numbers[0], numbers[numbers.length]).average().getAsDouble());


    }
}
