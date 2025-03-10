package Prepartion;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string ");
		String input = sc.nextLine();
		
		boolean palindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
		System.out.println(palindrome);
	}

}
