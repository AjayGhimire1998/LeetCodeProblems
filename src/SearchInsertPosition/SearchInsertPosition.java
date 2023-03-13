package SearchInsertPosition;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(searchInsert(nums, 5));
	}

	/*
	 * Given a sorted array of distinct integers and a target value, return the
	 * index if the target is found. If not, return the index where it would be if
	 * it were inserted in order.
	 * 
	 * You must write an algorithm with O(log n) runtime complexity.
	 * 
	 */
	public static int searchInsert(int[] nums, int target) {
		int result = 0;
		if (nums.length == 1) {
			if (nums[nums.length - 1] == target && nums[nums.length - 1] > target) {
				result = nums.length - 1;
			} else if (nums[nums.length - 1] < target) {
				result = nums.length;
			}

		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < target && nums[i + 1] >= target) {
				result = i + 1;
			}

			if (target > nums[nums.length - 1]) {
				result = nums.length;
			}
		}
		return result;
	}

}
