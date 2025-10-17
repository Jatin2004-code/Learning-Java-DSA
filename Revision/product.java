


package Revision;

import java.util.*;
public class product{
    public static void multiply(int num1 , int num2){
     //product 
     int product = num1 * num2 ;
        System.out.println(" num1 = " + num1);
        System.out.println(" num2 = " + num2);
        System.out.println(" product = " + product);
        
        


        
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    multiply(num1 , num2);
    }

    
}
