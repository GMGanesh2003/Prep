public class A6_CountEvenAndOddElements {
    // Problem: Count Even and Odd Elements
    // Pattern: Linear Traversal
    
    public static void countEvenOdd(int[] arr) {
        if (arr == null) return;
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even elements count: " + evenCount);
        System.out.println("Odd elements count: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 9, 11};
        countEvenOdd(arr);
    }
}

/*
 * How solved (Approach):
 * We initialize two counters: `evenCount` and `oddCount` to 0.
 * We traverse through the array. For each element, we check if it is divisible by 2 using the modulo operator (%).
 * If `num % 2 == 0`, we increment the `evenCount`.
 * Otherwise, we increment the `oddCount`.
 * 
 * Time Complexity: O(n) as we visit every element of the array exactly once.
 * Space Complexity: O(1) since we only maintain two integer variables to keep counts.
 */
