package LinearSearch;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxWelath(int[][] accounts) {
		int ans = Integer.MAX_VALUE;
		for(int person =0; person < accounts.length; person++) {
			int sum =0;
			for(int account=0; account < accounts[person].length;) {
				sum += accounts[person][account];
			}
			if (sum > ans ) {
				ans = sum;
			}
		}
		return ans;
		
	}

}
