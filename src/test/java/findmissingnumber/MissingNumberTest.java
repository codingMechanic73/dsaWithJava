package findmissingnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

    @Test
    void shouldFindMissingNumberUsingBruteForce() {
        int[] arr = {3, 2, 1, 4};
        int missingNumber = MissingNumber.findMissingNumberUsingBruteForce(arr);
        Assertions.assertEquals(5, missingNumber);
    }

    @Test
    void shouldFindMissingNumberUsingAdditionalMemory() {
        int[] arr = {3, 2, 1, 5};
        int missingNumber = MissingNumber.findMissingNumberUsingAdditionalMemory(arr);
        Assertions.assertEquals(4, missingNumber);
    }

    @Test
    void shouldFindMissingNumberUsingAP() {
        int[] arr = {3, 2, 1, 4};
        int missingNumber = MissingNumber.findMissingNumberUsingAP(arr);
        Assertions.assertEquals(5, missingNumber);
    }

    @Test
    void shouldFindMissingNumberEfficiently() {
        int[] arr = {3, 2, 1, 5};
        int missingNumber = MissingNumber.findMissingNumberEfficiently(arr);
        Assertions.assertEquals(4, missingNumber);
    }

}