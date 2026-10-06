public class A10_MaximumDifference {
    // Problem: Maximum arr[j] - arr[i], where j > i
    // Pattern: Minimum So Far
    
    public static int maxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // Update maxDiff if current element - minElement is strictly greater
            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
            }
            
            // Keep track of the minimum element seen so far
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum difference is: " + maxDifference(arr));
        
        int[] arr2 = {7, 9, 5, 6, 3, 2};
        System.out.println("Maximum difference is: " + maxDifference(arr2));
    }
}

/*
 * How solved (Approach):
 * We track two variables: `minElement` (the smallest element seen so far) and `maxDiff` (the maximum difference found so far).
 * We initialize `minElement` with the first element and `maxDiff` with arr[1] - arr[0].
 * As we iterate from the second element:
 *   1. We calculate the difference between the current element and `minElement`. If this is greater than `maxDiff`, we update `maxDiff`.
 *   2. If the current element is less than `minElement`, we update `minElement`.
 * 
 * The key pattern here is "current element - minimum seen before it". By keeping track of the minimum element as we go, we ensure j > i without a nested loop.
 * 
 * Time Complexity: O(n) because we traverse the array only once.
 * Space Complexity: O(1) as we use only two extra variables.
 */
