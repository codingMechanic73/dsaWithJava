package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void generateFizzBuzz() {
        int n = 5;
        String[] actualResult = FizzBuzz.generateFizzBuzz(n);
        Assertions.assertEquals(actualResult.length, n);
        Assertions.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, actualResult);
    }
}