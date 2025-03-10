
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///Write a program to find the missing number in an array 
		
		int highest_number;
		int [] numbers = new int[] {1,2,3,4,6,7};
		
		highest_number = 7;
		
		int expected_sum = highest_number*((highest_number+1)/2);
		int num_sum = 0;
		for(int i : numbers) {
			num_sum +=i;
		}
		System.out.println(expected_sum - num_sum);
		}
	}


