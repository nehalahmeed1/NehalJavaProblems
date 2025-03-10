package Prepartion;

public class swapCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Nehal";
		
		int pos1 = 1;
		int pos2 = 4;
		String result = swapchar(input, pos1, pos2);
		String charResult = charArray(input, pos1, pos2);
		
	System.out.println("stringBuilderResult : "+result);
	
	System.out.println("CharArray Result : " + charResult);	
		
}
	
	// Using String Builder
	public static String swapchar(String str, int pos1, int pos2) {
		StringBuilder stringBuilder = new StringBuilder(str);
		
		char temp = stringBuilder.charAt(pos1);
		
		stringBuilder.setCharAt(pos1, stringBuilder.charAt(pos2));
		
		stringBuilder.setCharAt(pos2, temp);
		return stringBuilder.toString();
	}
	
		
		
// Using Character Array
	
	
	
	public static String charArray( String str, int pos1, int pos2 ) {
		
		
		char[] charArray = str.toCharArray();
		
		char temp = charArray[pos1];
		
		charArray[pos1] = charArray[pos2];
		
		charArray[pos2] = temp;

		return new String(charArray);
		
		
		
		
		
		
	}
	
 
	
	
	
	
	}
	
	
	
