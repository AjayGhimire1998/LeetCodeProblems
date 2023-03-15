package IndexOfFirstOccurenceInAString;

public class IndexOfFirstStringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("abc", "c"));
	}

	/*
	 * Given two strings needle and haystack, return the index of the first
	 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 */
	public static int strStr(String haystack, String needle) {
//		if (haystack.length() < needle.length()) {
//			return -1;
//		}
//
//		if (haystack.equals(needle)) {
//			return 0;
//		}
//
//		for (int i = 0; i < haystack.length() - needle.length(); i++) {
//			int j = 0;
//			while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
//				j++;
//			}
//			if (j == needle.length()) {
//				return i;
//			}
//		}
//		return -1;

		return haystack.indexOf(needle);
	}

}
