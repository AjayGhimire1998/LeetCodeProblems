package RomanToInteger;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("XII"));
	}

	/**
	 * For example, 2 is written as II in Roman numeral, just two ones added
	 * together. 12 is written as XII, which is simply X + II. The number 27 is
	 * written as XXVII, which is XX + V + II.
	 * 
	 * Roman numerals are usually written largest to smallest from left to right.
	 * However, the numeral for four is not IIII. Instead, the number four is
	 * written as IV. Because the one is before the five we subtract it making four.
	 * The same principle applies to the number nine, which is written as IX. There
	 * are six instances where subtraction is used:
	 * 
	 * I can be placed before V (5) and X (10) to make 4 and 9.
	 * 
	 * X can be placed before L (50) and C (100) to make 40 and 90.
	 * 
	 * C can be placed before D (500)
	 * 
	 * and
	 * 
	 * M (1000) to make 400 and 900.
	 * 
	 * Given a roman numeral, convert it to an integer.
	 * 
	 * @param s
	 * @return
	 */
	public static int romanToInt(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'I') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					result -= 1;
				} else {
					result += 1;
				}
			} else if (c == 'V') {
				result += 5;
			} else if (c == 'X') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					result -= 10;
				} else {
					result += 10;
				}

			} else if (c == 'L') {
				result += 50;
			} else if (c == 'C') {
				if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					result -= 100;

				} else {
					result += 100;
				}

			} else if (c == 'D') {
				result += 500;
			} else if (c == 'M') {
				result += 1000;
			}

		}
		return result;
	}

}
