package rearrangepositivenegative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

class ReArrangePositiveNegativeTest {

    @Test
    void shouldReArrangePositiveNegativeArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, -7, -8, -9, 20, 10, -1, -2, -5, -5, -6, -7, 10, 3};
        int[] actualOutput = ReArrangePositiveNegative.reArrangePositiveNegative(input);
        Assertions.assertEquals(input.length, actualOutput.length);
        System.out.println(Arrays.toString(input));
    }
}