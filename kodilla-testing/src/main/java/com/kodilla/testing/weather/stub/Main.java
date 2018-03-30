package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        long count = strings.stream()
                .filter(s -> s.isEmpty())
                .count();

    return  count;
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        long count = strings.stream()
                .filter(s -> s.length() == 3)
                .count();
        return count;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        List<String> newList = strings.stream()
        .filter(s -> !s.isEmpty())
        .collect(Collectors.toList());
        return newList;
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {
        String mergedString = strings.stream()
                .filter(s1 -> !s1.isEmpty())
                .collect(Collectors.joining(s));
    return mergedString;
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        List<Integer> newList = numbers.stream()
                .distinct()
                .map(i -> i*i)
                .collect(Collectors.toList());
    return newList;
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
    return 0;
    }

    public static Integer getMinJava8(List<Integer> numbers) {
    return 0;
    }

    public static Integer getSumJava8(List<Integer> numbers) {
    return 0;
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
    return 0;
    }
}
