package addbinaryarray;

public class AddBinaryArray {

    private AddBinaryArray() {}

    public static int[] plusOne(int[] arr) {
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            if (sum <= 9) {
                return arr;
            }
            carry = sum / 10;
        }

        int[] newArr = new int[arr.length + 1];
        newArr[0] = carry;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    }
}
