/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/
package ispalindrome;

public class IsPalindrome {

    public static boolean isPalindrome(int x){
        if(x == 0)
            return true;
        if(x < 0 || x % 10 == 0)
            return false;
        
        int reversed = 0;
        while(x > reversed){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        if(x == reversed || x == reversed / 10)
            return true;
        else
            return false;       
    }
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    
}
