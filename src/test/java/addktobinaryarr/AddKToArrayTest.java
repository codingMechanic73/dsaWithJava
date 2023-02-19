package addktobinaryarr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddKToArrayTest {

    @Test
    void shouldAddKToArray() {
        int[] arr = {1, 1, 9, 9};
        int k = 11;
        List<Integer> result = AddKToArray.addK(arr, k);
        Assertions.assertEquals(result, List.of(1, 2, 1, 0));
    }

}