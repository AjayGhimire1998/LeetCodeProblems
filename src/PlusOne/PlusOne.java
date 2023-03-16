package PlusOne;

import java.util.Arrays;

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
		int[] digits = { 9 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	public static char[] plusOne(int[] digits) {
		char[] result;
		if (digits[digits.length - 1] == 9) {
			result = new char[digits.length + 1];
		} else {
			result = new char[digits.length];
		}
		String num = "";
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			num += Integer.toString(digits[i]);
		}
		sum = Integer.parseInt(num) + 1;
		for (int i = 0; i < Integer.toString(sum).length(); i++) {
			result[i] = Integer.toString(sum).charAt(i);
		}
		return result;
	}
}
