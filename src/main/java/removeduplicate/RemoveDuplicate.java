package removeduplicate;

public class RemoveDuplicate {

    private RemoveDuplicate() {}

    /**
     * Remove duplicates with single for loop
     * TimeComplexity: O(n)
     * SpaceComplexity: O(1)
     * @param arr input array
     * @return pivot till the point where array is sorted
     */
    public static int removeDuplicateUsingSingleForLoop(int[] arr) {
        int insertIndex = arr.length == 0 ? 0 : 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[insertIndex - 1] != arr[i]) {
                arr[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
