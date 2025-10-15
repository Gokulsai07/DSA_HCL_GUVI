import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3];
        double sum = 0;

        // Reading and validating marks
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered! Please enter values between 0 and 100.");
                return;
            }
            sum += marks[i];
        }

        // Calculating average
        double average = sum / 3.0;

        // Printing average with 2 decimal places (and comma as decimal separator)
        System.out.printf("Average Marks: %.2f%n", average);

        // Determining grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}