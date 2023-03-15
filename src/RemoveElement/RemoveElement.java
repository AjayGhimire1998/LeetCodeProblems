package RemoveElement;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(removeElement(nums, 1));
	}

	public static int removeElement(int[] nums, int val) {
		int k = 0;
		if (nums.length == 0 || (nums.length == 1 && nums[0] == val)) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return k;
	}

}
