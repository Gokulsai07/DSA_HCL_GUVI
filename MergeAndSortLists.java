import java.util.*;

public class MergeAndSortLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: first number
        int n = sc.nextInt();
        String num1 = sc.next(); // read digits as string

        // Input: second number
        int m = sc.nextInt();
        String num2 = sc.next(); // read digits as string

        // Use TreeSet to store digits (unique + sorted)
        Set<Integer> set = new TreeSet<>();

        // Add digits of first number
        for (char c : num1.toCharArray()) {
            set.add(c - '0');
        }

        // Add digits of second number
        for (char c : num2.toCharArray()) {
            set.add(c - '0');
        }

        // Print merged, unique, sorted digits
        for (int digit : set) {
            System.out.print(digit);
        }
    }
}
