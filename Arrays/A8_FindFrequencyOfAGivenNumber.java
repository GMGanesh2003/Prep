public class A8_FindFrequencyOfAGivenNumber {
    // Problem: Find Frequency of a Given Number
    // Pattern: Linear Traversal
    
    public static int findFrequency(int[] arr, int target) {
        if (arr == null) return 0;
        
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 9, 8};
        int target = 2;
        System.out.println("Frequency of " + target + " is: " + findFrequency(arr, target));
    }
}

/*
 * How solved (Approach):
 * We initialize a `count` variable to 0.
 * We loop through the array. Every time we encounter an element that matches our `target` number, we increment `count`.
 * Finally, we return the total `count`.
 * 
 * Time Complexity: O(n) because we examine each element in the array once.
 * Space Complexity: O(1) as we use only one extra variable `count`.
 */
