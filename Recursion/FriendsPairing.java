public class FriendsPairing {

    public static int pairFriends(int n) {
        // 🔸 Base Cases
        if (n == 1 || n == 2) {
            return n;
        }

        // 🔁 Recursive Formula
        return pairFriends(n - 1) + (n - 1) * pairFriends(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;  // number of friends
        System.out.println("Total ways to pair " + n + " friends: " + pairFriends(n));
    }
}
