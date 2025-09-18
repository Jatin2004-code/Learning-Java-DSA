import java.util.*;
public class practice18 {
public static void main(String[] args) {
    int marks[] = new int [100];
    
    Scanner sc = new Scanner(System.in);

marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();

System.out.println("phy :"+ marks[0]);
System.out.println("chem :"+ marks[1]);
System.out.println("bio :"+ marks[2]);
 

int percentange;
percentange =(marks[0] + marks[2] + marks[3] )/3;
System.out.println("percentange = " + percentange)
;
} 
    

}