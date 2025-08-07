package Pattern2;

public class FloydsTraingle {
        public static void floyds_traingle(int n){
            int counter = 1;
            //outer loop 
            for(int i=1; i<=n; i++){
             //inner-num counter print
             for(int j=1; j<=i; j++){
                 System.out.print(counter+" ");
                 counter++;
     
             }
             System.out.println();
     
             }
             
         }
         public static void main(String[] args) {
            floyds_traingle(5);
          
         }
     }
