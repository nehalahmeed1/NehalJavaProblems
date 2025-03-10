package Prepartion;

import java.util.Arrays;

public class SortStringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = " Openapi";
	char[] charArray = input.toCharArray();
	
	Arrays.sort(charArray);
	
	String sortedArray = new String(charArray);
	
	System.out.println(sortedArray);
	}

}
