package Arrays_Hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Contains Duplicate (LeetCode #217)
 *
 * Description: Given an integer array nums, return true if any value appears
 * at least twice in the array, and return false if every element is distinct.
 *
 * Example:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Approach: Use a HashSet to track seen elements. If we encounter an element
 * already in the set, we've found a duplicate.
 *
 * Time Complexity: O(n) where n is the length of the array
 * Space Complexity: O(n) in the worst case to store n distinct elements
 */
public class ContainDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // Create a set to store elements we've seen
        Set<Integer> seen = new HashSet<>();

        // Check each number in the array
        for (int num : nums) {
            // If we've seen this number before, return true
            if (seen.contains(num)) {
                return true;
            }

            // Otherwise, add it to our set of seen numbers
            seen.add(num);
        }

        // If we get here, no duplicates were found
        return false;
    }

    // Test method
    public static void main(String[] args) {
        ContainDuplicate solution = new ContainDuplicate();

        // Test case 1: Has duplicates
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1 - Expected: true, Actual: " + solution.containsDuplicate(nums1));

        // Test case 2: No duplicates
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2 - Expected: false, Actual: " + solution.containsDuplicate(nums2));

        // Test case 3: Multiple duplicates
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test 3 - Expected: true, Actual: " + solution.containsDuplicate(nums3));
    }
}