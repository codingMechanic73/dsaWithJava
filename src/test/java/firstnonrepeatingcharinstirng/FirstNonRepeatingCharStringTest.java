package firstnonrepeatingcharinstirng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstNonRepeatingCharStringTest {

    @ParameterizedTest
    @CsvSource({"HHeeLLo,o", "hhello,e", "0hheell,0"})
    void shouldGetNonRepeatingChar(String input, char expectedOutput) {
        char actualOutput = FirstNonRepeatingCharString.firstNonRepeatingCharStringUsingBruteForce(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({"HHeeLLo,o", "hhello,e", "0hheell,0"})
    void shouldGetNonRepeatingCharUsingArray(String input, char expectedOutput)  {
        char actualOutput = FirstNonRepeatingCharString.firstNonRepeatingCharStringUsingArray(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({"HHeeLLo,o", "hhello,e", "0hheell,0"})
    void shouldGetNonRepeatingCharUsingMap(String input, char expectedOutput) {
        char actualOutput = FirstNonRepeatingCharString.firstNonRepeatingCharStringUsingMap(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({"HHeeLLo,o", "hhello,e", "0hheell,0"})
    void shouldGetNonRepeatingWithSingleTraversal(String input, char expectedOutput)  {
        char actualOutput = FirstNonRepeatingCharString.firstNonRepeatingWithSingleTraversal(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldThrowNoSolutionException() {
        Assertions.assertThrows(NoSolutionFoundException.class, () -> FirstNonRepeatingCharString
                .firstNonRepeatingWithSingleTraversal("hheelloo"));
    }
}