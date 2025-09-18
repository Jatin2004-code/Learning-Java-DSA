import java.util.Scanner;

public class prctice6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      String  reportcard = n>=33 ? "pass":"fail";
      System.out.println(reportcard);
    }
    
}
