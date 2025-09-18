public class TilingProblem {

    static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;  // 🔸 Base case
        }

        return tilingWays(n - 1) + tilingWays(n - 2);  // 🔁 Recursion
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to tile " + n + "x2 floor: " + tilingWays(n));
    }
}
