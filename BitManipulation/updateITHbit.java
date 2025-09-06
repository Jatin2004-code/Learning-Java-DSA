package BitManipulation;

public class updateITHbit {
    public static int updateithbit(int n, int i, int v) {
        // Clear the ith bit
        int bitmask = 1 << i;
        n = n & ~bitmask; // Clear the ith bit to 0

        // Set the ith bit to v (0 or 1)
        if (v == 1) {
            n = n | bitmask; // Set the ith bit to 1
        }
        
        return n; // Return the updated number
    }

    public static void main(String[] args) {
        System.out.println(updateithbit(10, 1, 1)); // Output: 10 (binary: 1010)
        System.out.println(updateithbit(10, 2, 0)); // Output: 8 (binary: 1000)
    }
    
}
