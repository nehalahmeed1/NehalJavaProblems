
public class SingleElementinaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3,3,4,4,8,8};
		int ans = sortedArray(nums);
		System.out.println(ans);
	}

	static int sortedArray( int []num) {
		
	int start = 0;
	int end = num.length-1;
	while ( start < end) {
		int mid = start +(end-start)/2;
		
		if (mid %2==0) {
			if(num[mid]==num[mid+1]) {
				end = mid+1;
			}else {
				end = mid;
			}}else {
				if(num[mid]== num[mid-1]) {
					start = mid +1;
					
				}else {
					end = mid;
				}
			}
		}
	
	return num[start];
		
	}
}
