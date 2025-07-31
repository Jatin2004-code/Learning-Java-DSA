package Statements;
import java.util.*;
public class LogarithmCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        double naturalLog = Math.log(number);
        double base10Log = Math.log10(number);

        System.out.println("Natural logarithm (base e): " + naturalLog);
        System.out.println("Base 10 logarithm: " + base10Log);
    }
}


