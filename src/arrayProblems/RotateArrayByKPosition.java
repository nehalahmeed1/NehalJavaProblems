package arrayProblems;

import java.util.Arrays;

public class RotateArrayByKPosition {
	
public static void reverse(int arr[], int start, int end) {
		
		while( start < end) {
			int temp = arr[start];

			arr[start] = arr[end];
			arr[end] =temp;
			start++;
			end--;
		}
	}
	
	
	public static void rotate(int[] arr, int k) {
		k = k% arr.length;
		
   reverse(arr, 0,arr.length-1);
   reverse(arr,0, k-1);
   reverse(arr, k,arr.length-1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int k =3;
	rotate(arr,k);
		System.out.println("Roated Array: "+ Arrays.toString(arr));
		
		
		
		
	}

}
