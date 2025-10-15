import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionProblems {

    // 1. Find Pivot Index
    public int findPivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; // No pivot index found
    }

    // 2. Majority Element
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    // 3. Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }

    // 4. Find All Disappeared Numbers in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // The idea is to use the input array itself as a hash table.
        // We mark the numbers we've seen by negating the value at the corresponding index.
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        
        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }

    // 5. Two Sum
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method to demonstrate the solutions
    public static void main(String[] args) {
        SolutionProblems solver = new SolutionProblems();

        // Problem 1: Find Pivot Index
        int[] pivotNums = {1, 7, 3, 6, 5, 6};
        System.out.println("1. Find Pivot Index:");
        System.out.println("Input: " + Arrays.toString(pivotNums));
        System.out.println("Output: " + solver.findPivotIndex(pivotNums)); // Expected: 3
        System.out.println();

        // Problem 2: Majority Element
        int[] majorityNums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("2. Majority Element:");
        System.out.println("Input: " + Arrays.toString(majorityNums));
        System.out.println("Output: " + solver.majorityElement(majorityNums)); // Expected: 2
        System.out.println();

        // Problem 3: Squares of a Sorted Array
        int[] sortedSquaresNums = {-4, -1, 0, 3, 10};
        System.out.println("3. Squares of Sorted Array:");
        System.out.println("Input: " + Arrays.toString(sortedSquaresNums));
        System.out.println("Output: " + Arrays.toString(solver.sortedSquares(sortedSquaresNums))); // Expected: [0, 1, 9, 16, 100]
        System.out.println();

        // Problem 4: Find All Disappeared Numbers
        int[] disappearedNums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("4. Find Disappeared Numbers:");
        System.out.println("Input: " + Arrays.toString(disappearedNums));
        System.out.println("Output: " + solver.findDisappearedNumbers(disappearedNums)); // Expected: [5, 6]
        System.out.println();
        
        // Problem 5: Two Sum
        int[] twoSumNums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("5. Two Sum:");
        System.out.println("Input: " + Arrays.toString(twoSumNums) + ", target=" + target);
        System.out.println("Output: " + Arrays.toString(solver.twoSum(twoSumNums, target))); // Expected: [0, 1]
        System.out.println();
    }
}