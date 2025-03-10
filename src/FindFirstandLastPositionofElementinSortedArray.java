import java.util.Arrays;

import javax.swing.text.Position;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.searchRange(nums, target)));
    }
}

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = position(nums, target, true);  // Find the first occurrence
        int second = position(nums, target, false); // Find the last occurrence
        return new int[] {first, second};
    }

    static int position(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int position = -1;

        while (start <= end) { // Correct condition
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                position = mid;
                if (findFirst) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return position;
    }
}
	
