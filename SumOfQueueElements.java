import java.util.LinkedList;
import java.util.Queue;

public class SumOfQueueElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll(); // Remove each element and add to sum
        }

        System.out.println("Sum of all elements: " + sum);
    }
}