package removeduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicateTest {

    @Test
    void shouldRemoveDuplicateUsingSingleForLoop() {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8};
        int pivot = RemoveDuplicate.removeDuplicateUsingSingleForLoop(arr);

        int[] expectedOutput = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 6, 7, 8};
        Assertions.assertArrayEquals(expectedOutput, arr);
        Assertions.assertEquals(8, pivot);
    }
}