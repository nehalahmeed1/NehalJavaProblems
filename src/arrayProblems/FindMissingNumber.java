package arrayProblems;

public class FindMissingNumber {
	
	public static  int findNumber(int[] arr, int n) {
		
		int total = n*(n+1)/2;
		for(int num:arr) {
			total-=num;
		}
		return total;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,4,5,6};

int  missing = findNumber(arr,6);
System.out.println(missing);
	}

}
