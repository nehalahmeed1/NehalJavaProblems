package arrayProblems;

import java.util.HashMap;

public class ElementThatAppearsOnlyOnce {
	/*
	 * Find the Element That Appears Only Once (XOR Method)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [] = {2,3,5,5,3};

/*
 * 1. If There’s Only One Non-Repeating Number (XOR Works) If you are sure there
 * is only one unique number and all others appear twice, you can use XOR:
 */
int result = 0;
for(int i =0; i < arr.length; i++) {
	result ^= arr[i];
	
}
System.out.println("Unique element: "+ result);



/*
 * 2. If Multiple Unique Elements Exist If you want to find all unique numbers,
 * use HashMap or HashSet:
 */

int arr2[] = {2, 3, 5, 5, 10, 3}; 
HashMap<Integer, Integer> countMap = new HashMap<>();

// Count occurrences
for (int num : arr2) {
    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
}

// Print unique numbers
System.out.print("Unique elements: ");
for (int num : arr2) {
    if (countMap.get(num) == 1) {
        System.out.print(num + " ");
    }
}


































	}

}
