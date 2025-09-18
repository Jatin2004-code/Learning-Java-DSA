import java.util.Scanner;
public class practice29 {
    public static  boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length()/2;
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false; // If characters don't match, it's not a palindrome
            }
        
    }
        return true; // If all characters match, it's a palindrome
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        boolean result = isPalindrome(str); // 
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close(); // close the scanner
    }
}