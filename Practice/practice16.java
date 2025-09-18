import java.util.*;
public class practice16 {
    public static void swap(int a , int b){
        int temp = a ;
        a = b ;
        b = temp;
        System.out.println("a is = " + a);
        System.out.println("b is = " + b);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enete no. a =");
        int a = sc.nextInt();
        System.out.println("enete no. b = ");
        int b = sc.nextInt();
        swap(a, b);
        
    }
    }
    

