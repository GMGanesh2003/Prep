import java.util.Arrays;

public class A5_ReverseAnArray {
    // Problem: Reverse an Array
    // Pattern: Two Index / Swap
    
    public static void reverse(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move indices towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverse(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

/*
 * How solved (Approach):
 * We use the two-pointer technique. One pointer `start` at the beginning of the array, 
 * and another pointer `end` at the last index.
 * We swap the elements at `start` and `end`, then increment `start` and decrement `end`.
 * We continue this until `start` is no longer less than `end` (i.e., they meet in the middle).
 * 
 * Time Complexity: O(n) where n is the number of elements. We visit half the elements to swap them (n/2 operations, which simplifies to O(n)).
 * Space Complexity: O(1) as the swapping is done in place.
 */
