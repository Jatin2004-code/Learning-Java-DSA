import java.util.*;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=18){
            System.out.println("You can vote");
        }
        else if (n>=13 && n<=18){
            System.out.println("You are tennger");

        }
        else {
            System.out.println("You are child");
        }

        }
    }
    



