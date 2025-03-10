package Prepartion;

public class sumOfDigitsInString {

	public static void main(String[] args) {

		String s = "nehal12345";
		int sum = 0;
		
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
		if(Character.isDigit(c)) {
			sum = sum+Character.getNumericValue(c);
		}
		
		}
		
	System.out.println(sum);
	}

}
