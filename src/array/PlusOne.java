package array;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        if (digits[digits.length - 1] + 1 >= 10) {
            digits[digits.length - 1] = 0;
            int carry = 1;
            for (int i = digits.length - 2; i >= 0; i--) {
                digits[i] = digits[i] + carry;
                if (digits[i] < 10) {
                    carry = 0;
                    break;
                } else {
                    digits[i] = 0;
                }
            }
        }
        return digits;
    }

    @Test
    public void plusOneTest() {
        int[] digits = {1, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
