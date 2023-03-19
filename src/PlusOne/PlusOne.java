package PlusOne;

import java.math.BigInteger;
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
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println(Arrays.toString(plusOne(digits)));

//		System.out.println(plusOne(digits));
	}

	/*
	 * You are given a large integer represented as an integer array digits, where
	 * each digits[i] is the ith digit of the integer. The digits are ordered from
	 * most significant to least significant in left-to-right order. The large
	 * integer does not contain any leading 0's.
	 * 
	 * Increment the large integer by one and return the resulting array of digits.
	 */
	public static int[] plusOne(int[] digits) {
		String str = "";

		for (int i = 0; i < digits.length; i++) {
			str += Integer.toString(digits[i]);
		}

//		long resultInt = Long.valueOf(str) + 1;
		BigInteger resultIntt = new BigInteger(str);
		resultIntt = resultIntt.add(BigInteger.ONE);

		str = resultIntt.toString();
		int[] result = new int[str.length()];
		for (int j = 0; j < str.length(); j++) {

			result[j] = Character.getNumericValue(str.charAt(j));
		}
		return result;
	}

}
