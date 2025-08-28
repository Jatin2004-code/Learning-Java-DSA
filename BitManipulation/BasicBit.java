package BitManipulation;

public class BasicBit {
    public static void main(String[] args) {
        System.out.println("Hello, Bit Manipulation!");
       
        
        //Binary AND Operation
        System.out.print (( 5 & 6 )); // Output: 4

        //Binary OR Operation
        System.out.print (( 5 | 6 )); // Output: 7

        //Binary XOR Operation
        System.out.print (( 5 ^ 6 )); // Output: 3

        //Binary NOT Operation
        System.out.print (( ~5 )); // Output: -6

        //Left Shift Operation
        System.out.print (( 5 << 1 )); // Output: 10

        //Right Shift Operation
        System.out.print (( 5 >> 1 )); // Output: 2

        //Unsigned Right Shift Operation
        System.out.print (( 5 >>> 1 )); // Output: 2

        //Check if a number is even or odd using bitwise AND
        int number = 10;
        if ((number & 1) == 0) {
            System.out.println("\n" + number + " is even.");
        } else {
            System.out.println("\n" + number + " is odd.");
        }

        //Bit Manipulation is a technique to manipulate bits or binary digits in programming.
    }
    
}
