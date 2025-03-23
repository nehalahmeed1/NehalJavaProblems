package BinarySearch;

import java.util.Arrays;

public class InBuildMethodforBinarySearch {

	 public static void main(String[] args)
	    {

	          int a[] = { 10, 20, 15, 22, 35 };

	        // Sorting the above array
	        // using sort() method of Arrays class
	        Arrays.sort(a);

	        int x = 22;
	        
	          int res = Arrays.binarySearch(a, x);

	        if (res >= 0)
	            System.out.println(x + " found at index = " + res);
	        else
	            System.out.println(x + " Not found");

	        x = 40;
	        res = Arrays.binarySearch(a, x);
	          
	        if (res >= 0)
	            System.out.println(x + " found at index = " + res);
	        else
	            System.out.println(x + " Not found");
	    }
	 
	 

	 
	 
	 // Using Collections methods
	 
	 
		/*
		 * List<Integer> a = new ArrayList<Integer>();
		 * 
		 * // Populating the Arraylist a.add(1); a.add(2); a.add(3); a.add(10);
		 * a.add(20);
		 * 
		 * int x = 10; int res = Collections.binarySearch(a, x);
		 * 
		 * if (res >= 0) System.out.println(x + " found at index = " + res); else
		 * System.out.println(x + " Not found");
		 * 
		 * x = 15; res = Collections.binarySearch(a, x);
		 * 
		 * if (res >= 0) System.out.println(x + " found at index = " + res); else
		 * System.out.println(x + " Not found"); }
		 * 
		 * 
		 * 
		 */
	 
	 
	 
	 
	 
	 
	 
	}


