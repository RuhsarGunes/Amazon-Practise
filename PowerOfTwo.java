/*Given an integer, write a function to determine if it is a power of two.
Example 1:
Input: 1
Output: true 
Explanation: 20 = 1

Example 2:
Input: 16
Output: true
Explanation: 24 = 16

Example 3:
Input: 218
Output: false*/

package poweroftwo;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        long i = 1;
        
        while(i < n){
            i *= 2;
        }
        return i == n;
    }
    
    public static void main(String[] args) {
        boolean result1 = isPowerOfTwo(218);
        boolean result2 = isPowerOfTwo(16);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}
