package TwoSum;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3 };
		int[] nums2 = { 2, 7, 11, 15 };
//		System.out.println(Arrays.toString(twoSum(nums, 6)));
		System.out.println(Arrays.toString(two2Sum(nums, 6)));
	}

	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * Input: nums = [2,7,11,15], target = 9
	 * 
	 * Output: [0,1]
	 * 
	 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 * 
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public static int[] two2Sum(int[] nums, int target) {
		int[] result = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}

		return result;
	}
}
