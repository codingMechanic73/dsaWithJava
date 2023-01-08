package rearrangearray;

import java.util.*;

public class RearrangeArray {

    private RearrangeArray() {}

    /**
     * ReArrange using Brute Force
     * TimeComplexity: O(n^2)
     * SpaceComplexity: O(n)
     * @param array input Array
     * @return output Array
     */
    public static int[] reArrangeUsingBruteForce(int[] array) {
        int length = array.length;
        int[] outputArray = new int[length];

        for (int i = 0; i < length; i++) {
            boolean isPresent = false;

            if (array[i] == i) {
                isPresent = true;
            } else {
                for(int item: array) {
                    if (i == item) {
                        isPresent = true;
                        break;
                    }
                }
            }
            if (isPresent) {
                outputArray[i] = i;
            } else {
                outputArray[i] = -1;
            }
        }
        return outputArray;
    }

    /**
     * ReArrange using Set Force
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param array input Array
     * @return output Array
     */
    public static int[] reArrangeUsingSet(int[] array) {
        Set<Integer> set = new HashSet<>();

        for(Integer item: array) {
            set.add(item);
        }

        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (set.contains(i)) {
                output[i] = i;
            } else {
                output[i] = -1;
            }
        }
        return output;
    }

    /**
     * ReArrange using Cyclic Sort
     * TimeComplexity: O(n)
     * SpaceComplexity: O(1)
     * @param array input Array
     * @return output Array
     */
    public static int[] reArrangeUsingCyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] != i) {
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            } else {
                i++;
            }
        }
        return array;
    }
}
