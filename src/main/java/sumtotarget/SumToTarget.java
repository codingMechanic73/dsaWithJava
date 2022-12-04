package sumtotarget;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * Questions:
 * 1. Is array is any order of sorting?
 * 2. Will there be at-least one solution?
 */
public class SumToTarget {

    private SumToTarget(){}

    /**
     * Find sum to target using brute Force
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     * @param arr input array
     * @param target sum to be
     * @return the number contributing to the sum
     */
     static int[] getNoToTargetUsingBruteForce(int[] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if (arr[i] + arr[j] == target) {
                     return new int[]{arr[i], arr[j]};
                 }
             }
         }
        throw new NoSolutionFoundException();
    }


    /**
     * Find sum to target using sorting and 2 pointer search
     * TimeComplexity: O(NlogN) - TimeComplexity will be O(N) if already sorted
     * SpaceComplexity: O(NlogN) - SpaceComplexity will be O(1) if already sorted
     * @param arr input array
     * @param target sum to be
     * @return the numbers contributing to the sum
     */
    static int[] getNoToTargetUsingSortingAndTwoPointer(int[] arr, int target) {
         Arrays.sort(arr);
         int left = 0;
         int right = arr.length - 1;
         while(left < right) {
             if (arr[left] + arr[right] == target) {
                 return new int[]{arr[left], arr[right]};
             } else if (arr[left] + arr[right] < target) {
                 left++;
             } else {
                 right--;
             }
         }
        throw new NoSolutionFoundException();
    }

    /**
     * TimeComplexity: O(N)
     * SpaceComplexity: O(N)
     * @param arr input array
     * @param target sum to be
     * @return the numbers contributing to the sum
     */
    static int[] getNoToTargetUsingMap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (map.containsKey(arr[j])) {
                int difference = map.get(arr[j]);
                int i = arr[difference];
                return new int[]{i, j};
            } else {
                int difference = target-arr[j];
                map.put(difference, j);
            }
        }
        throw new NoSolutionFoundException();
    }
}
