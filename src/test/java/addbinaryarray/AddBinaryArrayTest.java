package addbinaryarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryArrayTest {

    @Test
    void shouldIncrementBinaryArray() {
        int[] arr = {9, 9, 9};
        int[] result = AddBinaryArray.plusOne(arr);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 0}, result);
    }

    @Test
    void shouldIncrementBinaryArray1() {
        int[] arr = {8, 9, 9};
        int[] result = AddBinaryArray.plusOne(arr);
        Assertions.assertArrayEquals(new int[]{9, 0, 0}, result);
    }

    @Test
    void shouldIncrementBinaryArray2() {
        int[] arr = {8, 9, 8};
        int[] result = AddBinaryArray.plusOne(arr);
        Assertions.assertArrayEquals(new int[]{8, 9, 9}, result);
    }

}