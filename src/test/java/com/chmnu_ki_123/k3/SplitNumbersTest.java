package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitNumbersTest {

    @Test
    void testSplitToNumbersWithValidInput() {
        String input = "12 34 56 78";
        int[] expected = {12, 34, 56, 78};
        int[] actual = SplitNumbers.splitToNumbers(input);
        assertArrayEquals(expected, actual, "The numbers should be correctly split and converted");
    }

    @Test
    void testSplitToNumbersWithInvalidNumbers() {
        String input = "12 abc 34";
        int[] expected = {12, -1, 34};
        int[] actual = SplitNumbers.splitToNumbers(input);
        assertArrayEquals(expected, actual, "The array should contain -1 for invalid numbers");
    }

    @Test
    void testSplitToNumbersWithNonInteger() {
        String input = "12 34 56 abc 78";
        int[] expected = {12, 34, 56, -1, 78};
        int[] actual = SplitNumbers.splitToNumbers(input);
        assertArrayEquals(expected, actual, "The array should correctly handle non-integer values by returning -1");
    }
}
