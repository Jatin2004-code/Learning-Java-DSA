public class Sortedarray {
    public static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true; // Base case: if we reach the last element, the array is sorted
            }

            if (arr[i] > arr[i + 1]) {
                return false; // If the current element is greater than the next, the array is not sorted
            }
            return isSorted(arr, i + 1); // Recursive call to check the next pair of elements
            
        }
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example sorted array
        System.out.println("Is the array sorted? " + isSorted(arr, 0)); // Start checking from the first index
            
        }
    }
    
