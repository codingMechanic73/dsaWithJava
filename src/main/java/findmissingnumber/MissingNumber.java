package findmissingnumber;

import java.util.Set;
import java.util.HashSet;

public class MissingNumber {

    /**
     * Using Brute Force
     * TimeComplexity O(n^2)
     * SpaceComplexity O(1)
     *
     * @param arr input array
     * @return missing number
     */
    public static int findMissingNumberUsingBruteForce(int[] arr) {
        int length = arr.length;
        for (int i = 1; i <= length; i++) {
            boolean isFound = false;
            for (int k : arr) {
                if (i == k) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return i;
            }
        }
        return length + 1;
    }

    /**
     * Using Additional Memory Force
     * TimeComplexity O(n)
     * SpaceComplexity O(n)
     *
     * @param arr input array
     * @return missing number
     */
    public static int findMissingNumberUsingAdditionalMemory(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int k : arr) {
            set.add(k);
        }

        int length = arr.length;
        for (int i = 1; i <= length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return length + 1;
    }

    /**
     * Using Arithmetic Progression
     * TimeComplexity O(n)
     * SpaceComplexity O(1)
     *
     * @param arr input array
     * @return missing number
     */
    public static int findMissingNumberUsingAP(int[] arr) {
        int length = arr.length;
        int n = length + 1;
        int sumOfNNaturalNumbers = n * (n + 1) / 2;
        int sumOfArrayElement = 0;

        for (int k: arr) {
            sumOfArrayElement += k;
        }

        return sumOfNNaturalNumbers - sumOfArrayElement;
    }

    /**
     * Using the same loop when array is large
     * TimeComplexity O(n)
     * SpaceComplexity O(1)
     *
     * @param arr input array
     * @return missing number
     */
    public static int findMissingNumberEfficiently(int[] arr) {
        int missingNumber = 0;

        int length = arr.length;
        for (int i = 1; i <= length + 1; i++) {
            int arrNum = 0;
            if (i <= length) {
                arrNum = arr[i-1];
            }
            missingNumber += i - arrNum;
        }

        return missingNumber;
    }
}
