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
 */

package Arrays_Hashing;
 
 
//This is a brute force approach with Time Complexity O(n^2) bc the nested loop and Space Complexity O(1)
public class ContainDuplicate {
    public static boolean IsDuplicate(int[] nums)
        {
            for(int i = 0; i < nums.length; i++ )
            {
                for(int j = i+1;j < nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        return true;
                    }
                }
            }
            return false;
        }
        
        public static void main(String[] args) {
            int[] test1 = {1,2,3,4};
            int[] test2 = {1,2,3,3};
            System.out.println(IsDuplicate(test1));
            System.out.println(IsDuplicate(test2));        
    }
 }

 
