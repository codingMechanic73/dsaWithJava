package addktobinaryarr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddKToArray {

    private AddKToArray() {}

    public static List<Integer> addK(int[] arr, int k) {
        List<Integer> result = new LinkedList<>();
        int index = arr.length - 1;

        int carry = 0;
        while(index >= 0 || k > 0 || carry > 0) {
            int sum = carry;

            if (index >= 0) {
                sum += arr[index];
                index--;
            }

            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            result.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(result);
        return result;
    }
}
