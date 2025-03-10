package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 19, 12 } };
		int target = 18;
		int[] ans = search(arr, target);
		
		System.out.println(Arrays.toString(ans));
		//System.out.println(searchMax(arr));
		System.out.println(max(arr));
	}

	static int[] search(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	/*
	 * static int searchMax(int[][] arr) { int max = Integer.MAX_VALUE; for (int row
	 * = 0; row < arr.length; row++) { for (int col = 0; col < arr[row].length;
	 * col++) { if (arr[row][col]> max ) { max = arr[row][col]; } } } return max; }
	 */

	
	///////////////// Enchnced loop///////////////
	
	static int max(int [][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] ints : arr) {
			for(int element : ints ) {
				if(element  > max) {
					max = element;
				}
			}
		}
		return max;
	}
}
