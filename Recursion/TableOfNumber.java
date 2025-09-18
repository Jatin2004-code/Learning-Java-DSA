

import java.util.Scanner;

public class TableOfNumber {

    // Recursive method to print table
    public static void printTable(int n, int i) {
        // Base case: stop at 10
        if (i > 10) {
            return;
        }

        // Print current line
        System.out.println(n + " x " + i + " = " + (n * i));

        // Recursive call for next multiplier
        printTable(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();

        System.out.println("Multiplication table of " + n + ":");
        printTable(n, 1);  // Start from 1

        sc.close();
    }
}
