import java.util.Scanner;

public class TaskSolutions {

    // Factorial for task arrangements
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Tower of Hanoi solution
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move box 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move box " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factorial input and output
        System.out.print("Enter number of tasks: ");
        int tasks = scanner.nextInt();
        System.out.println("Total possible arrangements - " + factorial(tasks));

        // Sum of digits input and output
        System.out.print("Enter bill number: ");
        int billNumber = scanner.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(billNumber));

        // Tower of Hanoi input and output
        System.out.print("Enter number of boxes for Tower of Hanoi: ");
        int boxes = scanner.nextInt();
        System.out.println("Tower of Hanoi moves:");
        towerOfHanoi(boxes, 'A', 'B', 'C');

        scanner.close();
    }
}