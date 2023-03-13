package LongestCommonPrefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = { "flooad", "flood", "flool" };
		System.out.println(longestCommonPrefix(str));

		String name = "Ajay";
		System.out.println(name.indexOf("y"));
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}
		String temp = strs[0];
		for (int i = 1; i < strs.length; i++) {

			System.out.println(strs[i].indexOf(temp));
			while (strs[i].indexOf(temp) != 0) {
				temp = temp.substring(0, temp.length() - 1);
				if (temp.isEmpty()) {
					return "";
				}
			}
		}
		return temp;

//		int l = 0;
//		int r = 0;
//		String s = strs[0];
//		for (int i = 1; i < strs.length; i++) {
//			for (int j = 0; j < strs[i].length(); j++) {
//				if (j > s.length() || s.length() == j) {
//					break;
//				}
//				if (s.charAt(j) == strs[i].charAt(j)) {
//					continue;
//				} else {
//					s = s.substring(0, j);
//				}
//			}
//		}
//		return s;
	}

}
