package arrayProblems;

public class FindlargestElement {
	
	
	  public static int largestElement(int[] arr) {
		//	int[] arr = {10,20,75,40,50};
			int max = arr[3];
			for( int num : arr) { 
				if( num >max) {
					max = num;
				}
			}
			return max;
	  
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//	System.out.println(largestElement(arr));
		
	int[] arr = {10,20,75,40,50};
	
		 System.out.println(largestElement(arr));
		
		
	}

}
