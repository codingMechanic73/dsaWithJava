package sumtotarget;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumToTargetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getIndexToTarget() {
        int[] inputArr = {5, 6, 1, 3, 5};
        int target = 4;
        int[] expectedOutput = new int[]{1, 3};
        int[] actualOutput = SumToTarget.getNoToTargetUsingBruteForce(inputArr, target);
        Assertions.assertArrayEquals(actualOutput, expectedOutput);
    }

    @Test
    void getIndexToTargetSorting() {
        int[] inputArr = {5, 6, 1, 3, 5};
        int target = 4;
        int[] expectedOutput = new int[]{1, 3};
        int[] actualOutput = SumToTarget.getNoToTargetUsingSortingAndTwoPointer(inputArr, target);
        Assertions.assertArrayEquals(actualOutput, expectedOutput);
    }

    @Test
    void getIndexToTargetUsingMap() {
        int[] inputArr = {5, 6, 1, 3, 5};
        int target = 4;
        int[] expectedOutput = new int[]{1, 3};
        int[] actualOutput = SumToTarget.getNoToTargetUsingMap(inputArr, target);
        Assertions.assertArrayEquals(actualOutput, expectedOutput);
    }


}