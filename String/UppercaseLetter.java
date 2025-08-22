package String;
/**
 * UppercaseLetter
 */
public class UppercaseLetter {
        public static void main(String[] args) {
            String sentence = "hello world";
            StringBuilder sb = new StringBuilder(sentence);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            System.out.println(sb.toString());  // Output: Hello world
        }
    }


    

