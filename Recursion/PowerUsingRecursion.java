public class PowerUsingRecursion {

    // Recursive function to calculate x^n
    public static int power(int x, int n) {
        // Base case
        if (n == 0)
            return 1;

        // Recursive case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2; // base
        int n = 5; // exponent
        int result = power(x, n);
        System.out.println(x + " raised to power " + n + " is: " + result);
    }
}
