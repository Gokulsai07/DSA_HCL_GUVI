import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String enteredPassword = sc.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop after successful login
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Wrong password. Attempts left: " + attempts);
                } else {
                    System.out.println("Account locked.");
                }
            }
        }

        sc.close(); // Always good to close the scanner
    }
}