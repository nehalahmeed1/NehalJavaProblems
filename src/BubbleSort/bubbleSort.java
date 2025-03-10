package BubbleSort;

public class bubbleSort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];

					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Unsorted array : ");
		  printArray(arr);
		  
bubbleSort(arr);
System.out.println("Sorted Array : ");
printArray(arr);
//
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for( int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}