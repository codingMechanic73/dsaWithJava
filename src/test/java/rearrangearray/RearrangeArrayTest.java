package rearrangearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RearrangeArrayTest {

    @Test
    void shouldReArrangeUsingBruteForce() {
        int[] input = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] expectedOutput = new int[]{-1, 1, 2, 3, 4, -1, 6, -1, -1, 9};
        int[] output = RearrangeArray.reArrangeUsingBruteForce(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }

    @Test
    void shouldReArrangeUsingSet() {
        int[] input = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] expectedOutput = new int[]{-1, 1, 2, 3, 4, -1, 6, -1, -1, 9};
        int[] output = RearrangeArray.reArrangeUsingSet(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }

    @Test
    void shouldReArrangeUsingCyclicSort() {
        int[] input = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] expectedOutput = new int[]{-1, 1, 2, 3, 4, -1, 6, -1, -1, 9};
        int[] output = RearrangeArray.reArrangeUsingCyclicSort(input);
        Assertions.assertArrayEquals(expectedOutput, output);
    }

}