public class RemoveDuplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // 🔸 Base Case: jab pura string traverse ho gaya
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // 🔍 Check if already added in answer
        if (map[currChar - 'a']) {
            // Skip this character
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Add character to result & mark as true
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        boolean[] map = new boolean[26]; // to track a-z
        removeDuplicates(str, 0, new StringBuilder(), map);
    }
}
