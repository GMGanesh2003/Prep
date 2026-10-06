public class A2_FindMinimumElement {
    // Problem: Find Minimum Element
    // Pattern: Linear Traversal
    
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        System.out.println("Minimum element: " + findMin(arr));
    }
}

/*
 * How solved (Approach):
 * We initialize the `min` variable with the first element of the array.
 * Then we iterate through the array from index 1.
 * If we encounter an element smaller than `min`, we update `min` with that element.
 * 
 * Time Complexity: O(n) where n is the number of elements. We traverse the array exactly once.
 * Space Complexity: O(1) because we only use one variable `min` for storage.
 */
