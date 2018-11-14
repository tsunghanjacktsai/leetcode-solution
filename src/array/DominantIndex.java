package array;

import org.junit.Test;

public class DominantIndex {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        nums[index] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i] * 2) {
                return -1;
            }
        }
        return index;
    }

    @Test
    public void dominantIndexTest() {
        int[] nums = {0, 0, 0, 1};
        System.out.println(dominantIndex(nums));
    }
}
