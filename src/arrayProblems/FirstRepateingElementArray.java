package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstRepateingElementArray {

	/*
	 * public static void fristRepeated(int[] arr) { Arrays.sort(arr);
	 * 
	 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
	 * j++) { if (arr[i] == arr[j]) { System.out.println(arr[i]); return; } } }
	 * 
	 * }
	 */
	public static int fristRepeatedSecondLogic(int[] arr) {

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			if (set.contains(num)) {
				return num;
			}
			set.add(num);
		}
		return -1;

	}


	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

	//	/* Frist Logic */ fristRepeated(arr);
		
		/* Second Logic */
		System.out.println(fristRepeatedSecondLogic(arr));
	}
}
