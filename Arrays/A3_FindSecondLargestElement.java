public class A3_FindSecondLargestElement {
    // Problem: Find Second Largest Element
    // Pattern: Variable Tracking
    
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
}

/*
 * How solved (Approach):
 * We use two variables `largest` and `secondLargest`.
 * We iterate through the array. 
 * - If the current element is greater than `largest`, we update `secondLargest` to `largest`, and `largest` to the current element.
 * - If the current element is smaller than `largest` but greater than `secondLargest`, we update `secondLargest` to the current element.
 * This ensures we don't count duplicate maximum values as the second largest.
 * 
 * Time Complexity: O(n) since we iterate through the array only once.
 * Space Complexity: O(1) as we only use two variables for tracking.
 */
