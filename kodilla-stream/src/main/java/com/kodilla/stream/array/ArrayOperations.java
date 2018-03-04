package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
           IntStream.rangeClosed(0,numbers[numbers.length-1])
                   .map(n -> numbers [n])
                   .forEach(System.out::println);
          double average = IntStream.rangeClosed(0, numbers[numbers.length-1])
                   .mapToDouble(n ->numbers[n])
                   .average()
                   .getAsDouble();

        return average;
    }
}
