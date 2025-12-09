public class LeepYear{
    public static void main(String args[]){
  
        int LeepYear = 2024;

        if(LeepYear % 4 == 0 && LeepYear % 100 != 0 || LeepYear % 400 == 0){
            System.out.println(LeepYear + " is a leap year.");
        } else {
            System.out.println(LeepYear + " is not a leap year.");
        }

    }
}