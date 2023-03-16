package PlusOne;

/*
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 */
public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		System.out.println(plusOne(digits));
	}

	public static String plusOne(int[] digits) {
		int[] result;
		if (digits[digits.length - 1] == 9) {
			result = new int[digits.length + 1];
		} else {
			result = new int[digits.length];
		}
		String num = "";
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			num += Integer.toString(digits[i]);
		}
		num = 

		return;
	}
}
