public class A1_FindMaximumElement {
    // Problem: Find Maximum Element
    // Pattern: Linear Traversal
    
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        System.out.println("Maximum element: " + findMax(arr));
    }
}

/*
 * How solved (Approach):
 * We initialize the `max` variable with the first element of the array.
 * Then we iterate through the array starting from the second element (index 1).
 * If we find an element greater than `max`, we update `max` to that element.
 * 
 * Time Complexity: O(n) where n is the number of elements in the array. We visit each element once.
 * Space Complexity: O(1) as we are only using a single variable (`max`) for tracking, regardless of array size.
 */
