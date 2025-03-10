package Prepartion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compareStringsAplhabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "Nehal";
		String st2 = "Ahmed";
		
		int result = st1.compareTo(st2);
		
		if(result < 0) {
			System.out.println(st1 + " comes before " + st2 +" alphabetically ");
		}else if (result > 0) {
			System.out.println(st1 + " comes after " + st2 +" alphabetically ");
		}else {
			System.out.println(st1+ " equlas " + st2 +" alphabetically ");
		}

		
	//     	Sorting Strings Alphabetically By Arrays.Sort 
		
		
		String[] string = {"Banna","apple","cherry","date"};
		
	Arrays.sort(string, String.CASE_INSENSITIVE_ORDER);
		
		
		System.out.println("Sorting Strings Alphabetically By Arrays.Sort  : "+ Arrays.toString(string));
		
		
	// Sorting String By Collection.sort	
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Banna");
		list.add("apple");
		list.add("cherry");
		list.add("date");
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Collection sort : " + list);
	}

}
