package ValidParenthesis;

public class ValidParenthesis {

	public static void main(String[] args) {

	}

	public boolean isValid(String s) {
		int count = 0;
		int parenthesisOpenIndex = 0;
		int parenthesisCloseIndex = 0;
		int curlyOpenIndex = 0;
		int curlyCloseIndex = 0;
		int squareOpenIndex = 0;
		int squareCloseIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				count++;
				parenthesisOpenIndex = s.indexOf(c);

			} else if (c == ')') {
				count--;
				parenthesisCloseIndex = s.indexOf(c);
			}

			if (c == '[') {
				count++;
				squareOpenIndex = s.indexOf(c);
			} else if (c == ']') {
				count--;
				squareCloseIndex = s.indexOf(c);
			}

			if (c == '{') {
				count++;
				curlyOpenIndex = s.indexOf(c);
			} else if (c == '}') {
				count--;
				curlyCloseIndex = s.indexOf(c);
			}
		}

			if ((parenthesisOpenIndex < squareOpenIndex && parenthesisOpenIndex < curlyOpenIndex)
					&& (parenthesisCloseIndex < squareCloseIndex && parenthesisCloseIndex < curlyCloseIndex)) {
				return true;
			}
			if ((squareOpenIndex < parenthesisOpenIndex && squareOpenIndex < curlyOpenIndex)
					&& (squareCloseIndex < parenthesisCloseIndex && squareCloseIndex < curlyCloseIndex)) {
				return true;
			}
			if ((curlyOpenIndex < parenthesisOpenIndex && curlyOpenIndex < squareOpenIndex)
					&& (curlyCloseIndex < parenthesisCloseIndex && curlyCloseIndex < squareCloseIndex)) {
				return true;
			}
		
			return false;
		
	}

}
