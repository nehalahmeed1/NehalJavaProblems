package arrayProblems;

public class PairInAnArrayThatSumsK {
	
	
	
	public static void pairArraySum(int[] arr, int target) {
		
		boolean found = false;
		
		for(int i = 0 ; i < arr.length;i++) {
			for( int j =i+1; j<arr.length; j++) {
				if(arr[i]+ arr[j]==target) {
					System.out.println("Pair found  :"+ arr[i]+" + "+ arr[j] +" = "+ target);
					found = true;
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Target Not Found" + target);
		}
		
		
		
		
	}
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {10,15,3,7};
		int target = 17;
		
		pairArraySum(arr, target);
		
	}

}
