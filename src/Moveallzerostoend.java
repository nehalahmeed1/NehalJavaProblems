
public class Moveallzerostoend {

	static void pushZeroToEnd(int arr[], int n) {
		int count = 0;
		for(int i = 0; i<n ;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		while(count < n ) {
			arr[count++] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,9,4,0,0,2,7,0,6,0,9};
		int n = arr.length;
		pushZeroToEnd(arr, n);
		System.out.println(" Arrey after pushing zeros to the back ");
		for(int i =0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
