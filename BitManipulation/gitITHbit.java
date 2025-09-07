package BitManipulation;

public class gitITHbit {
    public static int getithbit(int n, int i) {
        // Create a bitmask with 1 at the ith position
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0; // The ith bit is not set
        } else {
            return 1; // The ith bit is set
        }
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10, 1)); // Output: 1
    }
}