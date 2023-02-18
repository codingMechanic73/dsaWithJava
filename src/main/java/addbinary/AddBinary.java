package addbinary;

public class AddBinary {

    private AddBinary() {}

    public static String addTwoBinaryString(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        int index1 = str1.length() - 1;
        int index2 = str2.length() - 1;

        int carry = 0;
        while (index1 >= 0 || index2 >= 0 || carry > 0) {
            int sum = carry;
            if (index1 >= 0) {
                sum += str1.charAt(index1) - '0';
                index1--;
            }
            if (index2 >= 0) {
                sum += str2.charAt(index2) - '0';
                index2--;
            }

            int value = sum % 2;

            carry = sum / 2;
            sb.insert(0, value);
        }
        return sb.toString();
    }
}
