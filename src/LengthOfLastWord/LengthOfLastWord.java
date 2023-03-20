package LengthOfLastWord;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = "  He  llo, word joyfulll ";
		System.out.println(length(str));
	}

	public static int lengthOfLastWord(String s) {
		int length = 0;
		boolean found = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && found) {
				break;
			}
			if (s.charAt(i) != ' ') {
				length++;
				found = true;
			}

		}
		return length;
	}

	public static int length(String s) {
		int result = 0;
		boolean found = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && found) {
				break;
			}

			if (s.charAt(i) != ' ') {
				result++;
				found = true;
			}

		}
		return result;
	}
}
