package Function;

public class FunOverDataType {
    //fun to cal int sum
    public static int sum(int a , int b ) {
        return a+b;
        
    }
    //fun to cal float sum
    public static  float sum(int a , int b , int c ) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,5));
        
    }
    
}
    

