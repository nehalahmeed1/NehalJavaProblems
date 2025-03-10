package Prepartion;
import java.util.Scanner;

public class ReverseStringpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Solution 1
		String str = " My Name is Nehal Ahmed ", reverse="";
		
		/*
		 * for( int i = str.length()-1; i>0;i--) { reverse = reverse + str.charAt(i); }
		 * System.out.println(reverse);
		 */
		
		
// Solution 2 For Each Loop 
		
		
		  for(char ch : str.toCharArray()) { 
			  reverse = ch + reverse ; }
		  System.out.println(reverse);
		 
		
		// String Builder with Scanner class
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter String");
		 * 
		 * String input = sc.nextLine().trim();
		 * 
		 * System.out.println(" Reversed String :" + new
		 * StringBuilder(input).reverse());
		 */
		
		
		String word = str.toLowerCase().trim();

	StringBuilder ReverseResult = new StringBuilder(word).reverse();
		System.out.println(ReverseResult );
		 
	}

}
