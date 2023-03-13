package LongestCommonPrefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] strs) {
		String result = "";

		for (int i = 0; i < strs.length; i++) {
			String temp = strs[i];
			char tempChar = strs[i].charAt(i);
			System.out.println(temp);
			System.out.println(tempChar);
		}
		return result;
	}

}
