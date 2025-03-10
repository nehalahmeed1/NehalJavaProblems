package arrayProblems;

import java.util.Arrays;

public class removeDuplicates {
	
	public static int removeDuplicate(int[] arr) {
		
		
		if(arr.length== 0)
			return 0;
		
		int index =1;
		
		for(int i =1; i <arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[index++] = arr[i];
			}
		}
		return index;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		int[] arr = {1,1,2,2,3,4,4,5};
		int len = removeDuplicate(arr);
		System.out.println(len);
		System.out.println("Arryas without duplicate :" + Arrays.toString(Arrays.copyOf(arr, len)));
		
		
		
		// Another method for removing duplicates
		/*
		 * for(int i =0;i<arr.length;i++){ int count = 0; for(int j=0;j<=i;j++){
		 * if(a[i]==a[j]){ count++; } } if(count==1) System.out.println(a[i]); }
		 */

		
	}

}
