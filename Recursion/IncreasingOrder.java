public class IncreasingOrder {

    // Recursive function to print numbers from 1 to n
    static void printIncreasing(int n) {
        // Base condition
        if (n == 0)
            return;

        // Recursive call first (to print in increasing order)
        printIncreasing(n - 1);

        // Print after the recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;  // You can change this value
        System.out.println("Numbers from 1 to " + n + ":");
        printIncreasing(n);
    }
}
