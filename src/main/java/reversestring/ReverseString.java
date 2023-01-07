package reversestring;

public class ReverseString {

    private ReverseString() {}

    /**
     * Reverse String using For loop
     * Time complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingForReverseFetch(String input) {
        int length = input.length();
        char[] outputArray = new char[length];
        for (int i = 0; i < length; i++) {
            outputArray[i] = input.charAt(length-i-1);
        }
        return String.valueOf(outputArray);
    }

    /**
     * Reverse String using for loop
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingForInsertFirst(String input) {
        StringBuilder reversedString = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            reversedString.insert(0, input.charAt(i));
        }
        return reversedString.toString();
    }

    /**
     * Reverse String using Inplace For loop
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingInplaceFor(String input) {
        StringBuilder output = new StringBuilder(input);
        int length = input.length();
        for (int i = 0; i < length/2; i++) {
            swap(output, i, length-i-1);
        }
        return output.toString();
    }

    /**
     * Reverse String using Inplace 2 pointers
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingInplaceTwoPointer(String input) {
        StringBuilder output = new StringBuilder(input);
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            swap(output, left, right);
            left++;
            right--;
        }
        return output.toString();
    }

    /**
     * Reverse String using Inplace Recursion
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingInplaceRecursion(String input) {
        StringBuilder output = new StringBuilder(input);
        return reverseUsingInplaceRecursion(output, 0, input.length()-1).toString();
    }
    private static StringBuilder reverseUsingInplaceRecursion(StringBuilder input, int left, int right) {
        if (left < right) {
            swap(input, left, right);
            return reverseUsingInplaceRecursion(input, ++left, --right);
        }
        return input;
    }

    /**
     * Reverse String using Inplace Recursion
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param input Input String
     * @return Output String
     */
    public static String reverseUsingInplaceRecursionWithLevel(String input) {
        StringBuilder output = new StringBuilder(input);
        return reverseUsingInplaceRecursionWithLevel(output, 0).toString();
    }
    public static StringBuilder reverseUsingInplaceRecursionWithLevel(StringBuilder input, int level) {
        int length = input.length();
        if (level >= length/2) {
            return input;
        }
        swap(input, level, length-level-1);
        return reverseUsingInplaceRecursionWithLevel(input, ++level);
    }

    /**
     * Reverse using Divide and Conquer
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param input input String
     * @return output String
     */
    public static String reverseUsingDivideAndConquer(String input) {
        int length = input.length();
        if (length <= 1) {
            return input;
        }
        return input.charAt(length-1) + reverseUsingDivideAndConquer(input.substring(1, length-1)) + input.charAt(0);
    }

    private static void swap(StringBuilder input, int left, int right) {
        input.setCharAt(left, (char)(input.charAt(left) + input.charAt(right)));
        input.setCharAt(right, (char)(input.charAt(left) - input.charAt(right)));
        input.setCharAt(left, (char)(input.charAt(left) - input.charAt(right)));
    }
}
