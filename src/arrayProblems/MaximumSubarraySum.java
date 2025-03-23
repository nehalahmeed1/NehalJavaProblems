package arrayProblems;

public class MaximumSubarraySum {
	public static int MSAS(int[] arr) {
		int maxSUM = arr[0];
		int curSUM = arr[0];
		for (int i = 1; i < arr.length; i++) {
			curSUM = Math.max(arr[i], curSUM + arr[i]);
			maxSUM = Math.max(maxSUM, curSUM);
		}
		return maxSUM;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Max Sub Array SUM  " + MSAS(arr));
	}

}
