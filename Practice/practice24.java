import java.util.*;
public class practice24 {
    
    public static void pair(int number[]){
        for(int i =0 ; i<=number.length; i++){
            int curr = number[i];
            for(int j = i+1; j<number.length; j++){
                System.out.print("("+curr+","+number[j]+")");
            }
        System.out.println();


        }
 
        }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call pair function
        System.out.println("All pairs:");
        pair(numbers);

        sc.close();
    }
}
