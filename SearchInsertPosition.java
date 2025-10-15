import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: array elements
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Input: target element
        int target = sc.nextInt();

        // Find search insert position
        int index = searchInsert(arr, target);

        // Output
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right
            } else {
                right = mid - 1; // search left
            }
        }

        return left; // insertion position
    }
}
