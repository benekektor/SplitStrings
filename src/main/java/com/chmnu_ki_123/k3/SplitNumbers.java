package com.chmnu_ki_123.k3;

import java.util.Arrays;
import java.util.stream.Stream;

public class SplitNumbers {
    public static void main(String[] args) {
        String input = "12 34 56 78";
        int[] numbers = splitToNumbers(input);
        System.out.println("Масив чисел: " + Arrays.toString(numbers));
    }

    public static int[] splitToNumbers(String input) {
        return Stream.of(input.split("\\s+"))
                .mapToInt(SplitNumbers::parseIntSafe)
                .toArray();
    }

    private static int parseIntSafe(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

