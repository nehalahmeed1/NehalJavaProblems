package arrayProblems;

public class checkIfArrayIsSorted {

	public static boolean SoartedArray(int[] arr) {
		
		for(int i =1; i <arr.length-1;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4,5,6};
	System.out.println(SoartedArray(arr));	
		
	}

}
