package Revision;
import java.util.*;

// Calculates the sum of two numbers provided by the user using a function.
public class Sum1{
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = add(num1, num2);
        System.out.println("The sum is: " + result);
    }
}
