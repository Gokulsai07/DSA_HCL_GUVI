import java.util.Scanner;

// Node of a doubly linked list
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Doubly linked list with insert and delete operations
class DoublyLinkedList {
    Node head;
    Node tail;

    // Insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {           // List empty
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Delete the first node
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {           // Only one node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Display from head to tail
    public void displayForward() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display from tail to head
    public void displayBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        while (true) {
            System.out.println("\n1. Insert node at beginning");
            System.out.println("2. Delete first node");
            System.out.println("3. Display forward");
            System.out.println("4. Display backward");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter node value: ");
                    int value = sc.nextInt();
                    dll.insertAtBeginning(value);
                    break;
                case 2:
                    dll.deleteFirstNode();
                    break;
                case 3:
                    System.out.println("Forward order:");
                    dll.displayForward();
                    break;
                case 4:
                    System.out.println("Backward order:");
                    dll.displayBackward();
                    break;
                case 5:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}