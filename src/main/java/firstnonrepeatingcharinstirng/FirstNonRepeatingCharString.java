package firstnonrepeatingcharinstirng;
import java.util.*;
public class FirstNonRepeatingCharString {

    private FirstNonRepeatingCharString() {}

    /**
     * Using Brute Force
     * TimeComplexity: O(n^2)
     * SpaceComplexity: O(1)
     * @param input input String
     * @return non repeating char
     * @throws NoSolutionFoundException char not found
     */
    public static char firstNonRepeatingCharStringUsingBruteForce(String input) throws NoSolutionFoundException {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < length; j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return input.charAt(i);
            }
        }
        throw new NoSolutionFoundException();
    }

    /**
     * Using array
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param input input String
     * @return non repeating char
     * @throws NoSolutionFoundException char not found
     */
    public static char firstNonRepeatingCharStringUsingArray(String input) throws NoSolutionFoundException {
        int[] charCount = new int[256];
        int length = input.length();

        for (int i = 0; i < length; i++) {
            charCount[input.charAt(i)] += 1;
        }
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (charCount[ch] == 1) {
                return ch;
            }
        }
        throw new NoSolutionFoundException();
    }

    /**
     * Using Map
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param input input String
     * @return non repeating char
     * @throws NoSolutionFoundException char not found
     */
    public static char firstNonRepeatingCharStringUsingMap(String input) throws NoSolutionFoundException {
        Map<Character, Integer> map = new HashMap<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch)+1);
            }
        }
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        throw new NoSolutionFoundException();
    }

    /**
     * Using String single traversal
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param input input String
     * @return non repeating char
     * @throws NoSolutionFoundException char not found
     */
    public static char firstNonRepeatingWithSingleTraversal(String input) throws NoSolutionFoundException {
        int[] charCount = new int[256];
        Arrays.fill(charCount, -1);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCount[ch] == -1) {
                charCount[ch] = i;
            } else if (charCount[ch] >= 0) {
                charCount[ch] = -2;
            }
        }

        int index = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (charCount[i] >= 0 ){
                index = Math.min(charCount[i], index);
            }
        }
        if (index != Integer.MAX_VALUE) {
            return input.charAt(index);
        }
        throw new NoSolutionFoundException();
    }
}
