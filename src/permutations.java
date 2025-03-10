
public class permutations {

	// Function for swapping the characters

	public static String swapString(String a, int i, int j) {

		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;

		return String.valueOf(b);

	}

	public static void generatePermutation(String str, int start, int end) {

		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);

				generatePermutation(str, start + 1, end);
				str = swapString(str, start, i);
			}
		}

	}

	public static void printPermutation(String str, String perm, int idx) {

		if (str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newStr, perm + currChar, idx + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Neh";

		// int len = str.length();
		// generatePermutation(str, 0, len);

		printPermutation(str, "", 0);
	}

}
