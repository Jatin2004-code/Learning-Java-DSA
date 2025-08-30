package BitManipulation;

public class clearITHbit {
    public static int clearithbit(int n, int i) {
        // Create a bitmask with 1 at the ith position
        int bitmask = 1 << i;
        return n & ~bitmask; // Clear the ith bit to 0
    }

    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1)); // Output: 8 (binary: 1000)
        System.out.println(clearithbit(10, 2)); // Output: 6 (binary: 0110)
    }
    
}
