package reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseStringTest {


    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingForReverseFetch(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingForReverseFetch(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingForInsertFirst(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingForInsertFirst(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingInplaceFor(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingInplaceFor(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingInplaceTwoPointer(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingInplaceTwoPointer(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingInplaceRecursion(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingInplaceRecursion(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingInplaceRecursionWithLevel(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingInplaceRecursionWithLevel(input);
        Assertions.assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Madam, madaM",
            "Madama, amadaM",
            "a, a",
            "ba, ab"
    })
    void reverseUsingDivideAndConquer(String input, String expectedOutput) {
        String result = ReverseString.reverseUsingDivideAndConquer(input);
        Assertions.assertEquals(expectedOutput, result);
    }
}