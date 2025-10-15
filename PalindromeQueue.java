import java.util.*;

public class PalindromeQueue {
    public static void main(String[] args) {
        // Example queue: 1 2 3 2 1
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        Stack<Integer> stack = new Stack<>();

        // Copy elements to stack
        for(Integer num : queue) {
            stack.push(num);
        }

        boolean isPalindrome = true;
        for(Integer num : queue) {
            if(num != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print queue
        System.out.print("Queue: ");
        for(Integer num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Result
        if(isPalindrome) {
            System.out.println("Output: The queue is a palindrome.");
        } else {
            System.out.println("Output: The queue is NOT a palindrome.");
        }
    }
}