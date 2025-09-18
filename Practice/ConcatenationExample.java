import java.util.*;

class Practice27 {

    public static void printstring(String str) {
    
        System.out.println(str);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        //find the length of the string
        System.out.println(str.length());

        
        printstring(str);
        
        sc.close();
        
    }
}





public class ConcatenationExample {

    public static String concatenation() {
        String FirstName = "Jatin";
        String LastName = "Kanojiya";
        String FullName = FirstName + " " + LastName;
        return FullName;  // return the full name
    }

    public static void main(String[] args) {
        String result = concatenation();  // call the method and store result
        System.out.println("Concatenated String: " + result);
    }
}

