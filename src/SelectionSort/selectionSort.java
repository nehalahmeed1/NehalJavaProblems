package SelectionSort;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		int arr[] = {38,52,9,18,6,62,13};
		
		
		int temp =0; int min ;
		for( int i = 0 ; i <arr.length; i++) {
			min = i;
			
			for( int j =i+1; j<arr.length; j++) {
				if( arr[j]<arr[min]) {
					min = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for( int i =0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	

}
