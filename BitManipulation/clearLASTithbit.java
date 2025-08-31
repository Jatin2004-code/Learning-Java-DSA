package BitManipulation;

public class clearLASTithbit {
    public static int clearLastIthBit(int n, int i) {
        // Create a bitmask with 1s up to the ith position and 0s after
        int bitmask = (1 << i) - 1; // This creates a mask with 1s in lower bits
        return n & bitmask; // Clear the last ith bit to 0
    }

    public static void main(String[] args) {
        System.out.println(clearLastIthBit(10, 2)); // Output: 8 (binary: 1000)
        System.out.println(clearLastIthBit(10, 3)); // Output: 2 (binary: 0010)
    }

    
}
