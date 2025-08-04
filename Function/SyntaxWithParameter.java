package Function;
import java.util.*;

public class SyntaxWithParameter {
    public static int calculateSum(int num1, int num2){ // parameters or formal Prameters
        int sum = num1+num2;
        return sum;
  }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum  = calculateSum(a,b);// argument or actual parameters
       System.out.println("sum is :"+sum);

        
    }
    
}
