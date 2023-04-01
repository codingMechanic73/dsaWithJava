package mergesortedarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArraysTest {

    @Test
    void shouldMergeOneEmptyArrayWithNonEmptyArray() {
        int[] a ={};
        int[] b = {1, 2, 4, 5, 7, 9};
        int[] result = MergeSortedArrays.mergeSortedArrays(a, b);
        Assertions.assertArrayEquals(result, b);
    }

    @Test
    void shouldMergeTwoNonEmptyArray() {
        int[] a ={-1, 3, 8};
        int[] b = {1, 2, 4, 5, 7, 9};
        int[] result = MergeSortedArrays.mergeSortedArrays(a, b);
        Assertions.assertArrayEquals(result, new int[]{-1, 1, 2, 3, 4, 5, 7, 8, 9});
    }

    @Test
    void shouldMergeTwoEmptyArray() {
        int[] a ={};
        int[] b = {};
        int[] result = MergeSortedArrays.mergeSortedArrays(a, b);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
}