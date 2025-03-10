package LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 18, 12, -7, 3, 14, 28 };

		int target = 3;
		System.out.println(linearSearch2(arr, target, 0, 4));
	}

	static int linearSearch(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = start; i <= end; i++) {
			int element = arr[i];
			if (element == target) {
				return i;

			} 
		}
		return -1;
	}

	static boolean linearSearch2(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = start; i <= end; i++) {
			int element = arr[i];
			if (element == target) {
				return true;

			}
		}
		return false;
	}

}
