public class LastOccurrence {

    // Recursive function to find the last occurrence of key
    public static int lastOccur(int[] arr, int i, int key) {
        // Base case: if we reach the end of the array
        if (i == arr.length) {
            return -1;
        }

        // Recursive call to check the rest of the array
        int isFound = lastOccur(arr, i + 1, key);

        // If found in later part, return that index
        if (isFound != -1) {
            return isFound;
        }

        // If current element matches and nothing found ahead, return current index
        if (arr[i] == key) {
            return i;
        }

        // Not found at all
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5}; // Example array
        int key = 2;
        System.out.println("Last occurrence of " + key + " is at index: " + lastOccur(arr, 0, key));
    }
}


