import java.util.Arrays;  // Import Arrays class
import java.util.Scanner;

public class InbuiltSortExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: User se array ka size lena
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Step 2: Array create karna
        int[] arr = new int[n];

        // Step 3: Array ke elements lena
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Inbuilt sorting function lagana
        Arrays.sort(arr);  // Ascending order mein sort karega

        // Step 5: Sorted array print karna
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
