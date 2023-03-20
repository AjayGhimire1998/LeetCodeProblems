package PlalindromeNumber;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIt(20002));
	}

	/**
	 * Given an integer x, return true if x is a palindrome , and false otherwise.
	 * 
	 * @param x
	 * @return true or false
	 */
	public static boolean isPalindrome(int x) {

		String str = Integer.toString(x);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}

	public static boolean isIt(int x) {

		String param = Integer.toString(x);

		for (int i = 0; i < param.length(); i++) {
			if (param.charAt(i) != param.charAt(param.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
