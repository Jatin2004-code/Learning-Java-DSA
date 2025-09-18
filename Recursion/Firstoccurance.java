public class Firstoccurance {
    public static int firstOccur(int arr[], int i, int key) {
        // Base case: if we reach the end of the array
        if (i == arr.length) {
            return -1; // Key not found
        }

        // If the current element matches the key, return its index
        if (arr[i] == key) {
            return i;
        }

        // Recursive call to check the next element
        return firstOccur(arr, i + 1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5}; // Example array
        System.out.println("First occurrence of 2 is at index: " + firstOccur(arr, 0, 2)); // Change the key as needed    
        
    
}
}