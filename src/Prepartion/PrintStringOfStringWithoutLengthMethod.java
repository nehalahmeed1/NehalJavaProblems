package Prepartion;

public class PrintStringOfStringWithoutLengthMethod {

	public static int getString(String str) {
		
		int count = 0;
		
		for(char c : str.toCharArray()) {
			count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//  Q) Length of String Without length()
		
		String as = " Test String Length ";
		
		
		  int totalCount = getString(as);
		  System.out.println("String Count : "+ totalCount);
		 
		
	}

	
	
	
}
