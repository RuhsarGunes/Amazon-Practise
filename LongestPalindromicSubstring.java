/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/
package longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    private static int start = 0;
    private static int maxLen = 1;  // if all characters are distinct
    public static String longestPalindrome(String s){
        int len = s.length();
        if(len <= 1)
            return s;
        for(int i = 0; i < len; i++){
            helper(s, i - 1, i + 1); // if the length of string is odd
            helper(s, i, i + 1); // if the length of string is even
        }
        return s.substring(start, start + maxLen);
    }
    
    private static void helper(String s, int head, int tail){
        while(head > 0 && tail < s.length() && s.charAt(head) == s.charAt(tail)){
            int len = tail - head + 1;
            if(len > maxLen){
                maxLen = len;
                start = head;
            }
            head--;
            tail++;
        }
    }
    public static void main(String[] args) {
       String input = "abcbx";
       String output = longestPalindrome(input);
       System.out.println(output);
    }
    
}
