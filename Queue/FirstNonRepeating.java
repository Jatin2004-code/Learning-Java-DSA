package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeating {

    public static void firstNonRepeating(String str) {

        int count[] = new int[26]; // frequency of characters
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // step 1: increase frequency
            count[ch - 'a']++;

            // step 2: add to queue
            q.add(ch);

            // step 3: remove repeating characters
            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // step 4: print answer
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {

        String str = "aabccxb";
        firstNonRepeating(str);
    }
}

