
package BitManipulation;

public class clearRangeofbit {
    public static int clearRangeOfBits(int n, int i, int j) {
        // Create a bitmask with 1s in the range [i, j]
        int bitmask = ((1 << (j - i + 1)) - 1) << i;
        return n & ~bitmask; // Clear the bits in the range [i, j]
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(15, 1, 2)); // Output: 9 (binary: 1001)
        System.out.println(clearRangeOfBits(31, 0, 4)); // Output: 16 (binary: 10000)
    }
}
