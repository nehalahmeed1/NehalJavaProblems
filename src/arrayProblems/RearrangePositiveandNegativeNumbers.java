package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveandNegativeNumbers {
	
	public static void arrange(int [] arr) {
		
		List<Integer> pos = new ArrayList<>();
		
		List<Integer> neg = new ArrayList<>();
		
		for( int num : arr) {
			if(num >=0 ) pos.add(num);
			else neg.add(num);
		}
		int i =0, j=0, k=0;
		while( i<pos.size() && j<neg.size()) {
			
			arr[k++] = pos.get(i++);
			arr[k++] = neg.get(j++);
		}
		
		while (i < pos.size()) {
			arr[k++] = pos.get(i++);
		}
		while (j < neg.size()) {
			arr[k++] = neg.get(j++);
		}

	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1, 2, -3, -4, 5, -6, 7, -8};

arrange(arr);
System.out.println(Arrays.toString(arr));
	}

}
