package array;

import java.util.ArrayList;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left = 0;
            } else {
                left += nums[i - 1];
            }
            if (left * 2 + nums[i] == total) {
                return i;
            }
        }
        return -1;
    }
}
