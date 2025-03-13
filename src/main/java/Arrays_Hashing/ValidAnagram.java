/**
Valid Anagram

 Given two strings s and t, return true if the two strings are anagrams of each other,
 otherwise return false.

 An anagram is a string that contains the exact same characters as another string,
 but the order of the characters can be different.

 Example 1:
 Input: s = "racecar", t = "carrace"
 Output: true

 Example 2:
 Input: s = "jar", t = "jam"
 Output: false

 Constraints:
 s and t consist of lowercase English letters.
*/

package Arrays_Hashing;
public class ValidAnagram{
    public static boolean isAnagram(String s,String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for(int val : count){
            if(val !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String name1 = "bach";
        String name2 = "halb";
        System.out.println(isAnagram(name1, name2));
    }
}