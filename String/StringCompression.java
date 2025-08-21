package String;

public class StringCompression {
        public static void main(String[] args) {
            String input = "aaaabbbccddd";
            String compressed = compress(input);
            System.out.println("Compressed: " + compressed); // Output: a4b3c2d3
        }
    
        public static String compress(String str) {
            if (str == null || str.length() == 0) {
                return str;
            }
    
            StringBuilder compressed = new StringBuilder();
            char currentChar = str.charAt(0);
            int count = 1;
    
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == currentChar) {
                    count++;
                } else {
                    compressed.append(currentChar).append(count);
                    currentChar = str.charAt(i);
                    count = 1;
                }
            }
    
            compressed.append(currentChar).append(count);
            return compressed.toString();
        }
    
    
}
