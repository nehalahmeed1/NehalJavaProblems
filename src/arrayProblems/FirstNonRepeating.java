package arrayProblems;

public class FirstNonRepeating {

	public static void firstNonRepeating(int [] arr) {
		
		boolean isreapead;
		for ( int i =0 ; i< arr.length; i++) {
			isreapead= false;
			for( int j =0; j<arr.length;j++) {
				if(i != j && arr[i] == arr[j]) {
					isreapead =true;
					break;
				}
			}
			if(!isreapead) {
				System.out.println(arr[i]);
			return; // Return will display 1st non repeated numbers, If return is removed it will display all the non repated numbers
			}
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {10,5,3,4, 5,3,6};
firstNonRepeating(arr);
	}

}
