package addbinary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    void shouldAddTwoBinaryString() {
        String str1 = "1001";
        String str2 = "110";
        String result = AddBinary.addTwoBinaryString(str1, str2);
        Assertions.assertEquals("1111", result);
    }

    @Test
    void shouldAddTwoBinaryStringWithOverflow() {
        String str1 = "1111";
        String str2 = "1111";
        String result = AddBinary.addTwoBinaryString(str1, str2);
        Assertions.assertEquals("11110", result);
    }

}