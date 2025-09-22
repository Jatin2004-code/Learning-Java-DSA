
public class RotatedArraySearch {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If target is found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {
                // Target in left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else { // Go right
                    low = mid + 1;
                }
            } 
            // Else, right half is sorted
            else {
                // Target in right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else { // Go left
                    high = mid - 1;
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
