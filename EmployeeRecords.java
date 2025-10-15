import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    float salary;
    Employee next;

    Employee(int employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.next = null;
    }
}

class EmployeeList {
    Employee head;

    void addEmployee(int employeeId, String employeeName, float salary) {
        Employee newEmployee = new Employee(employeeId, employeeName, salary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newEmployee;
        }
        System.out.println("Employee " + employeeName + " (Employee ID: " + employeeId + ") added successfully!");
    }

    void deleteEmployee(int employeeId) {
        if (head == null) {
            System.out.println("No records to delete");
            return;
        }
        if (head.employeeId == employeeId) {
            System.out.println("Employee " + head.employeeName + " (Employee ID: " + employeeId + ") deleted.");
            head = head.next;
            return;
        }
        Employee temp = head;
        while (temp.next != null && temp.next.employeeId != employeeId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Employee with ID " + employeeId + " not found");
        } else {
            System.out.println("Employee " + temp.next.employeeName + " (Employee ID: " + employeeId + ") deleted.");
            temp.next = temp.next.next;
        }
    }

    void displayEmployee() {
        if (head == null) {
            System.out.println("No employee records available.");
            return;
        }
        System.out.println("Employee records:");
        Employee temp = head;
        while (temp != null) {
            System.out.println("  -> Employee ID: " + temp.employeeId + ", Name: " + temp.employeeName + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }

    void searchEmployee(int employeeId) {
        Employee temp = head;
        while (temp != null) {
            if (temp.employeeId == employeeId) {
                System.out.println("Found Employee -> ID: " + temp.employeeId + ", Name: " + temp.employeeName + ", Salary: " + temp.salary);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee with ID " + employeeId + " not found");
    }

    void findHighPaid() {
        if (head == null) {
            System.out.println("No records available.");
            return;
        }
        Employee temp = head;
        Employee highPaid = head;
        while (temp != null) {
            if (temp.salary > highPaid.salary) {
                highPaid = temp;
            }
            temp = temp.next;
        }
        System.out.println("Highest Paid -> ID: " + highPaid.employeeId + ", Name: " + highPaid.employeeName + ", Salary: " + highPaid.salary);
    }

    void countEmployee() {
        int count = 0;
        Employee temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of employees: " + count);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList e1 = new EmployeeList();
        int choice;

        do {
            System.out.println("\n************** Employee Records ***************");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Find Highest Paid");
            System.out.println("6. Count");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int employeeId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter employee name: ");
                    String employeeName = sc.nextLine();
                    System.out.print("Enter salary: ");
                    float salary = sc.nextFloat();
                    e1.addEmployee(employeeId, employeeName, salary);
                    break;
                case 2:
                    System.out.print("Enter employee ID to delete: ");
                    int delID = sc.nextInt();
                    e1.deleteEmployee(delID);
                    break;
                case 3:
                    e1.displayEmployee();
                    break;
                case 4:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();
                    e1.searchEmployee(searchId);
                    break;
                case 5:
                    e1.findHighPaid();
                    break;
                case 6:
                    e1.countEmployee();
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);

        sc.close();
    }
}