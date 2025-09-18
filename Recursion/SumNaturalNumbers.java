public class SumNaturalNumbers {

    // Recursive function to find sum
    static int sumOfNatural(int n) {
        // Base condition
        if (n == 0)
            return 0;

        // Recursive step
        return n + sumOfNatural(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;  // You can change the value of n
        int result = sumOfNatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
