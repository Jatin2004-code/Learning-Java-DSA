package ArrayList;
import java.util.ArrayList;
// → ArrayList class import kar rahe hain

public class PairSumBruteForce {
// → Class ka naam PairSumBruteForce rakha hai

    public static void main(String[] args) {
// → Program execution yahin se start hota hai

        ArrayList<Integer> list = new ArrayList<>();
// → Integer type ka ek ArrayList banaya

        list.add(2);
// → list me 2 add kiya

        list.add(7);
// → list me 7 add kiya

        list.add(11);
// → list me 11 add kiya

        list.add(15);
// → list me 15 add kiya

        int target = 9;
// → target sum define kiya (jiska pair chahiye)

        for (int i = 0; i < list.size(); i++) {
// → pehla loop, first element ke liye

            for (int j = i + 1; j < list.size(); j++) {
// → doosra loop, second element ke liye
// → j = i+1 taaki same element dobara use na ho

                if (list.get(i) + list.get(j) == target) {
// → agar dono elements ka sum target ke equal ho

                    System.out.println(
                        "Pair found: " + list.get(i) + ", " + list.get(j)
                    );
// → pair print kar diya
                }
            }
        }
    }
}
