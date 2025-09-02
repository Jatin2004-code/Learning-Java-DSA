package BitManipulation;

public class setITHbit {
    public static int setithbit(int n, int i) {
        // Create a bitmask with 1 at the ith position
        int bitmask = 1 << i;
        return n | bitmask; // Set the ith bit to 1
    }

    public static void main(String[] args) {
        System.out.println(setithbit(10, 1)); // Output: 10 (binary: 1010)
        System.out.println(setithbit(10, 2)); // Output: 14 (binary: 1110)
    }
    
}
