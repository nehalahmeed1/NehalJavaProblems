import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class CountOfAlphabetsDigitsSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 	UsingFor each loop
/*	//	String str = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the char");

		String input = scn.nextLine();
		int alphabets = 0, digits = 0, specialChar = 0;
		
		for( char ch : input.toCharArray()) {
			if( Character.isLetter(ch)) {
				alphabets++;
			}else if (Character.isDigit(ch)) {
					digits++;
				
			}else {
				specialChar++;
			}
			
		}
		System.out.println(" Total alphabets " + alphabets);
		System.out.println(" Total digits " + digits);
		System.out.println(" Total specialChar " + specialChar);
	}*/
		
		
	// Using Normal solution 
		
		
	//	String str = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter String ");
		
	 String input = sc.nextLine();
		int alphabets = 0, digits = 0, specialChar = 0;
		for( int i =0 ; i< input.length(); i++) {
			char ch = input.charAt(i);
		
		/*for ( int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);*/
			
			if(Character.isLetter(ch)) {
				alphabets++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				specialChar++;
			}
	    
		}
		System.out.println("Total alphabets "+ alphabets);
	    System.out.println("Total digits "+ digits);
	    System.out.println("Total specialChar "+ specialChar);
	 
	}

}
