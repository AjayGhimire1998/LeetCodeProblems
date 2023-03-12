package PlalindromeNumber;

import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {
	public void testisPalindrome() {
		assertEquals(false, PalindromeNumber.isPalindrome(220));
		assertEquals(false, PalindromeNumber.isPalindrome(-121));
	}
}
