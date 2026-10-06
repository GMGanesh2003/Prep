public class A7_FindSumOfArrayElements {
    // Problem: Find Sum of Array Elements
    // Pattern: Linear Traversal
    
    public static int findSum(int[] arr) {
        if (arr == null) return 0;
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10};
        System.out.println("Sum of array elements: " + findSum(arr));
    }
}

/*
 * How solved (Approach):
 * We initialize a variable `sum` to 0.
 * We traverse through each element in the array and add its value to `sum`.
 * Once the traversal is complete, we return `sum`.
 * 
 * Time Complexity: O(n) where n is the number of elements in the array. We visit each element once.
 * Space Complexity: O(1) as we use a single variable `sum` regardless of the array size.
 */
