public class Factorial {
public static int fact(int n){
    // Base case
    if (n == 0){
        return 1;
    }

    // Recursive case

  int  fnm1 = fact(n - 1);
  int fn = n * fact (n-1);
    return fn;



}
 public static void main(String[] args) {
    int n = 5; // You can change this value to compute factorial of a different number
    int result = fact(n);
    System.out.println("Factorial of " + n + " is: " + result);
 }
    

    
}



    // // Recursive function to find factorial
    // static int factorial(int n) {
    //     // Base case
    //     if (n == 0 || n == 1)
    //         return 1;

    //     // Recursive step
    //     return n * factorial(n - 1);
    // }

    // public static void main(String[] args) {
    //     int n = 5;  // Change this value to test other numbers
    //     int result = factorial(n);
    //     System.out.println("Factorial of " + n + " is: " + result);
    // }