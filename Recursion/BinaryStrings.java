public class BinaryStrings {

    public static void printBinaryStrings(int n, int lastChar, String str) {
        // 🔸 Base case: jab string complete ho jaye
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // 🔹 Hamesha 0 rakh sakte hain
        printBinaryStrings(n - 1, 0, str + "0");

        // 🔹 Agar last character 0 tha, toh hi 1 rakh sakte hain
        if (lastChar == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;  // input length
        printBinaryStrings(n, 0, "");  // Start with lastChar = 0, str = ""
    }
}
