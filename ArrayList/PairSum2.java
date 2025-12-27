package ArrayList;

import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int n = list.size();
        // → ArrayList ka size store kiya

        int bp = -1;
        // → breaking point (pivot) ka index
        // → jahan sorted order toot ta hai

        // -------- Step 1: Find Breaking Point --------
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        // → left pointer = smallest element ka index

        int rp = bp;
        // → right pointer = largest element ka index

        // -------- Step 2: Two Pointer Logic --------
        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);
            // → lp aur rp ka sum nikala

            if (sum == target) {
                return true;
                // → target mil gaya, pair exists
            }

            if (sum < target) {
                lp = (lp + 1) % n;
                // → circular increment (right move)
            } else {
                rp = (n + rp - 1) % n;
                // → circular decrement (left move)
            }
        }

        return false;
        // → agar koi pair nahi mila
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
        // → true print hoga
    }
}
