public class A9_FindFirstOccurrenceOfAnElement {
    // Problem: Find First Occurrence of an Element
    // Pattern: Linear Traversal
    
    public static int findFirstOccurrence(int[] arr, int target) {
        if (arr == null) return -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index immediately when found
            }
        }
        
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 7, 5};
        int target = 7;
        
        int index = findFirstOccurrence(arr, target);
        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}

/*
 * How solved (Approach):
 * We use a standard for-loop to traverse the array, starting from index 0.
 * For each element, we check if it is equal to the `target`.
 * As soon as we find it, we return the current index `i`.
 * If the loop finishes and the element was not found, we return -1 to indicate its absence.
 * 
 * Time Complexity: O(n) in the worst case (if the element is at the end or not present). In the best case, it's O(1).
 * Space Complexity: O(1) as no additional memory is required.
 */
