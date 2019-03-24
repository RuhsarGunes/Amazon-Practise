/*Given a 32-bit signed integer, reverse digits of an integer.
Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21
*/
package reverseinteger;

public class ReverseInteger {

    public static int reverse(int x){
        boolean sign = false;
        if(x < 0){
            sign = true;
            x *= -1;
        }
        long reversed = 0;
        while(x > 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        
        if(reversed > Integer.MAX_VALUE){
            return 0;
        }
        return sign ? (int)(-1 * reversed) : (int)reversed;
    }
    public static void main(String[] args) {
      int x = 321;
      int output = reverse(x);
      System.out.println(output);
    }
    
}
