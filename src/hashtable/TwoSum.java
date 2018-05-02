package hashtable;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		for (int x = 1; x < nums.length; x++) {

			for (int y = x + 1; y < nums.length; y++) {

				if (target - nums[x] == nums[y]) {
					return new int[] { x, y };
				}
			}
		}
		return nums;
	}

	public static int[] twoSum_2(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]), i};
			} else {
				map.put(target - nums[i], i);
			}
		}
		return new int[] {0, 0};
	}
	
	
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = twoSum(nums, target);
		int[] ans_2 = twoSum_2(nums, target);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < ans_2.length; i++) {
			System.out.print(ans_2[i] + " ");
		}
	}
}
