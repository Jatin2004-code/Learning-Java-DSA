import java.util.*;

public class practice21 {

    // Function to get the largest number
    public static int getLargeNum(int numbers[]) {
        int largest = Integer.MIN_VALUE;   // smallest possible value
        int smallest = Integer.MAX_VALUE;  // largest possible value

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            } else if (smallest > numbers[i]) {
                smallest = numbers[i];
            } else {
                System.out.println("Number is not Smallest or Largest: " + numbers[i]);
            }
        }

        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many elements
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        // Create array and take input
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call function
        int largest = getLargeNum(numbers);
        System.out.println("Largest value is: " + largest);
    }
}
