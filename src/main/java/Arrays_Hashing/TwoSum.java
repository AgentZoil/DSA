package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;

// Two Sum
// Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

// You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

// Return the answer with the smaller index first.

// Example 1:

// Input: 
// nums = [3,4,5,6], target = 7

// Output: [0,1]
// Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

// Example 2:

// Input: nums = [4,5,6], target = 10

// Output: [0,2]
// Example 3:

// Input: nums = [5,5], target = 10

// Output: [0,1]

// Constraints:
// 2 <= nums.length <= 1000
// -10,000,000 <= nums[i] <= 10,000,000
// -10,000,000 <= target <= 10,000,000

public class TwoSum {
    //Brute Force approach, Time complexity O(n^2) nested loop
    // public static int[] twoSum(int[] nums, int target) {
    //     for(int i =0; i < nums.length; i++){
    //         for(int j = i+1; j< nums.length;j++){
    //             if(nums[i]+ nums[j]== target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[] {};       
    // }

    //HashMap Approach (more complicated than brute force) but time complexity is O(n)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length;i++){
            int remains = target - nums[i];
            if(numbers.containsKey(remains)){
                return new int[]{numbers.get(remains),i};
            }
            numbers.put(nums[i],i);
        }

        return new int[] {};       
    }

    public static void main(String[] args) {
     int[] test1 = {1,2,3,4,5};
     int goal = 9;
     System.out.println(Arrays.toString(twoSum(test1, goal)));   
    }
}
