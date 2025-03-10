package arrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
	
	public static int[] intersaction(int[]arr1, int[] arr2) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> result= new HashSet<>();
		for(int num : arr1) {
		  set1.add(num);
		}for(int num : arr2) {
			if(set1.contains(num)) {
				result.add(num);
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	//
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {1,2,2,3,4};
		int[] arr2 = {2,3,5};
		
		intersaction(arr1, arr2);
		System.out.println(Arrays.toString(intersaction(arr1, arr2)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
