//Prime Numners - 2,3,5,7,11
package Loop;
import java.util.*;

public class PrimeNumber {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() ;

    if(n == 2){
        System.out.println("n is prime000");
    } else{


    boolean isPrime = true;
    for(int i=2; i<=n-1; i++){
        if(n % 1==0){
            isPrime = false ;
        }

        }
    if(isPrime = true ) {
        System.out.println("n is prime");
    } else {
        System.out.println("n is not prime ");

    }

    
 }

    
}
}
