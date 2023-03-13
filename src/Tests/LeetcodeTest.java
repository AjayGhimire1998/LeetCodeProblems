package Tests;

import PlalindromeNumber.PalindromeNumber;
import junit.framework.TestCase;

public class LeetcodeTest extends TestCase {

//	public void testTwoSum() {
//		int[] nums = { 2, 7, 11, 15 };
//		int target = 9;
//		int[] result = { 0, 1 };
////		assertArrayEquals(result, TwoSum.twoSum(nums, target));
//	}

	public void testisPalindrome() {
		assertEquals(false, PalindromeNumber.isPalindrome(220));
		assertEquals(false, PalindromeNumber.isPalindrome(-121));
	}

//	public void testrRomanToInteger() {
//		assertEquals(false, false);
//	}
}
