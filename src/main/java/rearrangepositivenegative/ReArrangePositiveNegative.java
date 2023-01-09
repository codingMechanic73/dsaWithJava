package rearrangepositivenegative;

public class ReArrangePositiveNegative {

    private ReArrangePositiveNegative() {}

    public static int[] reArrangePositiveNegative(int[] array) {
        int pivot = 0;
        int searchIndex = 1;
        boolean nextElementShouldBePositive = array[0] < 0;
        while(searchIndex < array.length) {
           if (nextElementShouldBePositive && array[searchIndex] > 0) {
               pivot += 1;
               swap(searchIndex, pivot, array);
               searchIndex = pivot+1;
               nextElementShouldBePositive = false;
           } else if (!nextElementShouldBePositive && array[searchIndex] < 0) {
               pivot += 1;
               swap(searchIndex, pivot, array);
               searchIndex = pivot+1;
               nextElementShouldBePositive = true;
           } else {
               searchIndex++;
           }
        }
        return array;
    }

    private static void swap(int indexA, int indexB, int[] array) {
        int sum = array[indexA] + array[indexB];
        array[indexB] = sum - array[indexB];
        array[indexA] = sum - array[indexB];
    }
}
