
  package arrayProblems;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void Reverse(int[] arr) {
		
     int left =0; int right = arr.length-1;
     
     while(left <right) {
    	 int temp = arr[left]; 
    	 arr[left] = arr[right];
    	 arr[right] = temp;
    	 left++;
    	 right--;
    	 
     }
     
	 }
     
     public static void main(String[] arr) {
    	 
    	 int[] arr1 = {1,2,3,4,5};
    	 Reverse(arr1);
    	 
    	 System.out.println("Reverse String :"+ Arrays.toString(arr1));
    
	}

}
