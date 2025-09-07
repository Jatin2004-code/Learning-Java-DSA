package BitManipulation;

public class oddoreven {
    public static void oddoreven(int n) {
        int bitmask = 1; // 0001 in binary
if ((n & bitmask) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }

    public static void main(String[] args) { // Example number
        oddoreven(3);// Call the method to check if the number is odd or even
        oddoreven(10); // Call the method to check if the number is odd or even
        oddoreven(58); // Call the method to check if the number is odd or even
        oddoreven(99); // Call the method to check if the number is odd or even
    }
    
}
