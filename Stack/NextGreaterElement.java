package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = {6, 8, 0, 1, 3};
        int n = arr.length;

        int nge[] = new int[n];   // Next Greater Element array
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove all elements smaller or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty, no greater element
            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }

            // Push current element into stack
            stack.push(arr[i]);
        }

        // Print result
        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }
}

