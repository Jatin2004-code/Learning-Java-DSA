package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int lp = 0;
        // → left pointer ko start index (0) par rakha

        int rp = list.size() - 1;
        // → right pointer ko last index par rakha

        while (lp != rp) {
        // → jab tak left aur right pointer same na ho jaaye

            // case 1: pair mil gaya
            if (list.get(lp) + list.get(rp) == target) {
                return true;
                // → target ke equal sum mila, isliye true return
            }

            // case 2: sum chhota hai
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
                // → sum badhane ke liye left pointer aage badhao
            }
            else {
                // case 3: sum bada hai
                rp--;
                // → sum kam karne ke liye right pointer peeche lao
            }
        }

        return false;
        // → agar koi bhi pair nahi mila to false
    }
}
