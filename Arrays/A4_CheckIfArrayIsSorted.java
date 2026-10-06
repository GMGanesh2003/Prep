public class A4_CheckIfArrayIsSorted {
    // Problem: Check if Array Is Sorted
    // Pattern: Linear Traversal
    
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Found an element smaller than the previous one
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 3, 4};
        
        System.out.println("Is arr1 sorted? " + isSorted(arr1));
        System.out.println("Is arr2 sorted? " + isSorted(arr2));
    }
}

/*
 * How solved (Approach):
 * We traverse the array starting from the second element.
 * At each step, we compare the current element with the previous element.
 * If the current element is strictly less than the previous element, the array is not sorted in ascending order, so we return false.
 * If we finish the loop without finding such a pair, we return true.
 * 
 * Time Complexity: O(n) because we do a single traversal of the array.
 * Space Complexity: O(1) since no extra space is needed apart from a loop variable.
 */
