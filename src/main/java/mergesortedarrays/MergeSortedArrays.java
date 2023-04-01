package mergesortedarrays;

class MergeSortedArrays {

    private MergeSortedArrays() {}

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int[] result = new int[lenA + lenB];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < lenA && j < lenB) {
            if(a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < lenA) {
            result[k++] = a[i++];
        }

        while (j < lenB) {
            result[k++] = b[j++];
        }

        return result;
    }
}
