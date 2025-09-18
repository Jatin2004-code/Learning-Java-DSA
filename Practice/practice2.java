
import java.util.*;

public class practice2 {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextInt();
        float eraser = sc.nextInt();
        float pen = sc.nextInt();
       float total = pencil + eraser + pen ;
     System.out.println("bill is :"+total );

     //gst 
     float newtotal = total+(0.18f * total );

     System.out.println("bil with 18 % tax : " + newtotal);
      


    ;


    }
    
}
