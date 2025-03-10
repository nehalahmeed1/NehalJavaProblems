package arrayProblems;

import java.util.Arrays;

public class rightRotation {
	// Rotate an Array by K Positions
	// (Right rotation

	/*
	 * public static int[] rotatedRight(int[] arr, int k) {
	 * 
	 * int n = arr.length;
	 * 
	 * int[] result = new int[n]; for(int i =0; i<n;i++) { result[(i +k)% n] =
	 * arr[i]; //System.out.println(result);
	 * 
	 * }
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * 
	 * public static int[] leftRotation(int[] arr, int k) {
	 * 
	 * int n = arr.length;
	 * 
	 * int[] result = new int[n]; for(int i =0; i<n;i++) { result[i]= arr[(i +k)%
	 * n]; }
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * 1 more way to rotate the array
	 * public static void rotateArray(int [] a, int k){
	 * 
	 * int n = a.length; k = k%n;
	 * 
	 * for( int i =0; i<k ; i++){ int last = a[n-1]; for(int j = n-1; j>0;j--){
	 * a[j]= a[j-1]; } a[0] = last; }
	 * 
	 * 
	 * }
	 */
	// As per let code
	public static void rotateRight(int [] arr, int k) {

	k=k%arr.length;
  
	    reverse(arr, 0, arr.length-1);
		reverse(arr, 0,k-1 );
		reverse(arr, k, arr.length-1);	
		
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end) {
		int temp = arr[start];
		arr[start]= arr[end];
		arr[end]= temp;
		start++;
		end--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
	//	int[] rotatedRight = rotatedRight(arr, k);
		// int[] roteddLeft = leftRotation(arr, k);
	//	System.out.println("Right" + Arrays.toString(rotatedRight));
//		System.out.println("Left"+Arrays.toString(roteddLeft));
		
		rotateRight(arr, k);
		System.out.println("Rotate Right:"+ Arrays.toString(arr));
	}

}
