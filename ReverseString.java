/*Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, 
you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

package reversestring;


public class ReverseString {

    public static void reverseString(char[] s){
        //recursive solution
        helper(0, s.length - 1, s);
    }
    public static void helper(int startIndex, int endIndex, char[] s){
        if(startIndex > endIndex)
            return;
        
        char temp = s[startIndex];
        s[startIndex] = s[endIndex];
        s[endIndex] = temp;
        
        helper(startIndex + 1, endIndex - 1, s);
    }
    public static void main(String[] args) {
        char[] input = {'H','a','n','n','a','h'};
        reverseString(input);
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
    
}
