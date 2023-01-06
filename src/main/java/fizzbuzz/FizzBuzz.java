package fizzbuzz;

public class FizzBuzz {

    private FizzBuzz() {}

    /**
     * FizzBuzz using simple For loop
     * TimeComplexity: O(n)
     * SpaceComplexity: O(n)
     * @param n Total Count
     * @return array
     */
    public static String[] generateFizzBuzz(int n) {
        String[] array = new String[n];
        for (int i = 1; i <= n; i++) {
            String result = String.valueOf(i);
            if (i % 15 == 0) {
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            }
            array[i-1] = result;
        }
        return array;
    }
}
