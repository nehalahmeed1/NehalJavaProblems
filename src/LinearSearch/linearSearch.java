package LinearSearch;

public class linearSearch {

	public static void main(String[] args) {
		int [] nums = {16,45,36,17,9,17,-3,6};
		int target = 119;
		boolean  ans = linearSearch4(nums, target);
		System.out.println(ans);
		

	}
	
////////////////////////// INDEX VALUE //////////////////////////

	/*
	 * static int linearSearch(int[] arr, int target) { if( arr.length==0) { return
	 * -1; } for(int i =0; i <arr.length;i++) { int element = arr[i]; if(element ==
	 * target) { return i;
	 * 
	 * } } return -1; }
	 */
	
////////////////////////// RETURN VALUE     //////////////////////////
	/*
	 * static int linearSearch2(int[] arr, int target) { if( arr.length==0) { return
	 * -1; } for(int i =0; i <arr.length;i++) { int element = arr[i]; if(element ==
	 * target) { return element;
	 * 
	 * } } return -1; }
	 */
//////////////////////////     MAX        //////////////////////////
	
/*	static int linearSearch3(int[] arr, int target) {
		if( arr.length==0) {
			return -1;
		}
		for(int i =0; i <arr.length;i++) {
			int element = arr[i];
			if(element == target) {
				return i;
				
			}
		}
		return Integer.MAX_VALUE;
		}
	}*/
 ////////////////////////// BOLEAN VALUE //////////////
	
	static boolean linearSearch4(int[] arr, int target) {
		if( arr.length==0) {
			return false;
		}
		for(int i =0; i <arr.length;i++) {
			int element = arr[i];
			if(element == target) {
				return true;
				
			}
		}
		return false;
	}
}
	

