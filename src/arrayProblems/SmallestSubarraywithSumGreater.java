package arrayProblems;

public class SmallestSubarraywithSumGreater {

	
	public static int minSubArraylen(int s, int [] arr) {
		
		
		int n = arr.length;
		
		int minLen = Integer.MAX_VALUE;
		
		int sum = 0;
		int start = 0;
		
		for( int end =0; end < n; end++) {
			
			sum+= arr[end];
			while(sum >=s) {
				minLen = Math.min(minLen, end-start+1);
				sum -= arr[start++];
			}
		}
		
		return (minLen == Integer.MAX_VALUE)?0:minLen;
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {2,3,1,2,4,3};
		int s = 7;
		System.out.println(minSubArraylen(s,arr));
	}

}
