public class Fibonacciseries {
    
    // Recursive function to find nth Fibonacci number
    public static int fib(int n) {
        // Base case
        if (n ==0 || n == 1) {
            return n;
        }
        
        // Recursive case
        int fnm1 = fib(n - 1); // Fibonacci of (n-1)
        int fnm2 = fib(n - 2); // Fibonacci of (n-2)
        int fn = fnm1 + fnm2; // Fibonacci of n is the sum of the two previous Fibonacci numbers
        return fn;
    }
    
    public static void main(String[] args) {
        int n = 10; // You can change this value to compute Fibonacci of a different number
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is " + result);
        
    }
}
