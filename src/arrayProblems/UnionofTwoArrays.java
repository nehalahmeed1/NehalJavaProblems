package arrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionofTwoArrays {

	public static int[] unionArray(int[] arr1, int[] arr2) {
		
		Set<Integer> set = new HashSet<>();
		for(int num : arr1) {
			set.add(num);
		}
		for(int num : arr2) {
			set.add(num);
		}
		
		
		return set.stream().mapToInt(Integer:: intValue).toArray();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,2,3,4};
		int[] arr2 = {2,3,5};
		unionArray(arr1, arr2);
		System.out.println(Arrays.toString(unionArray(arr1, arr2)));
		
	}

}
