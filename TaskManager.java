//write a menu driven program using a doubly linked list to manage tasks(Add ,delete,display).import java.util.Scanner;

// Node representing a Task
import java.util.Scanner;
class TaskNode {
    String task;
    TaskNode next;
    TaskNode prev;

    TaskNode(String task) {
        this.task = task;
        this.next = null;
        this.prev = null;
    }
}

// Doubly Linked List to manage tasks
class TaskList {
    private TaskNode head;
    private TaskNode tail;

    // Add a task at the end
    public void addTask(String task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Task added: " + task);
    }

    // Delete a task by its name (first occurrence)
    public void deleteTask(String task) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }
        TaskNode current = head;
        while (current != null) {
            if (current.task.equalsIgnoreCase(task)) {
                if (current == head && current == tail) { // only node
                    head = tail = null;
                } else if (current == head) { // first node
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) { // last node
                    tail = tail.prev;
                    tail.next = null;
                } else { // middle node
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Task deleted: " + task);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found: " + task);
    }

    // Display tasks from head to tail
    public void displayForward() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Tasks (Forward):");
        TaskNode current = head;
        while (current != null) {
            System.out.println("- " + current.task);
            current = current.next;
        }
    }

    // Display tasks from tail to head
    public void displayBackward() {
        if (tail == null) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Tasks (Backward):");
        TaskNode current = tail;
        while (current != null) {
            System.out.println("- " + current.task);
            current = current.prev;
        }
    }
}

// Main class with menu
public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList tasks = new TaskList();

        while (true) {
            System.out.println("\n====== Task Manager ======");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Tasks (Forward)");
            System.out.println("4. Display Tasks (Backward)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice;
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number!");
                sc.next(); // clear invalid input
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = sc.nextLine().trim();
                    tasks.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task to delete: ");
                    String delTask = sc.nextLine().trim();
                    tasks.deleteTask(delTask);
                    break;
                case 3:
                    tasks.displayForward();
                    break;
                case 4:
                    tasks.displayBackward();
                    break;
                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose 1–5.");
            }
        }
    }
}