package arrayProblems;

import java.util.Arrays;

public class MoveAllZeroEnd {
	
	public static void moveZero(int[] arr) {
		int j =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j++] =arr[i];
			}
			
			}
		while(j<arr.length) {
			arr[j++]=0;
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {0,1,0,3,12};
moveZero(arr);
System.out.println(Arrays.toString(arr));
	}

}
