public class practice23 {
    public static void reverse(int number[]) {
        int first = 0 , last= number.length-1;


        while (first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp ;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={10 ,20 , 30 ,40 , 50 };
        reverse(number);
        for ( int i =0 ; i < number.length ; i ++){
            System.out.print(number[i]+ "  ");
        }
    }

        }
        
