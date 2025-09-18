 import java.util.*;
 class Practice28 {
 


    public static void printlatters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        printlatters(str);  // call the method to print letters
        
        sc.close();  // close the scanner
    }
}
