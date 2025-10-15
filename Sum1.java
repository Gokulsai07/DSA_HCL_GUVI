// //sum of digits
// public class Sum1{
//     public static void main(String [] args){
//         int a=123;
//         int sum=0;
//         while(a!=0){
//             int b=a%10;
//             sum+=b;
//             a=a/10;
//         }
//         System.out.println(sum);

//     }
// }
import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}