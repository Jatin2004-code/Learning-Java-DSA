package Pattern2;

public class HalfPyramidNo {
    public static void half_pyramid_Number(int n){
        //outer loop 
        for(int i=1; i<=n; i++){
         //inner-number
         for(int j=1; j<=n-i; j++){
             System.out.print(j+" ");
 
         }
         System.out.println();
 
         }
         
     }
     public static void main(String[] args) {
        half_pyramid_Number(4);
      
     }
 }
 

