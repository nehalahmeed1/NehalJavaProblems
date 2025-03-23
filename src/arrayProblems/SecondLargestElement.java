package arrayProblems;

public class SecondLargestElement {
	
	public static int SecondElement(int [] arr) {
int first = -1, second = -1;

	
	for( int num : arr) {
		if(num>first) {
			second = first;
			first = num;
		}
		else if(num>second && num!=first) {
			
			second =num;	
		
		}
		
		
	}
	return second;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,50,75};
		
		
		System.out.println(SecondElement(arr));
		

	

}

}
