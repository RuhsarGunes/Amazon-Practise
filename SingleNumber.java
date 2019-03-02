/*Given a non-empty array of integers, every element appears twice except for one. 
Find that single one.

Note: Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
package singlenumber;

import java.util.HashSet;

public class SingleNumber {

    /*
    we use bitwise XOR to solve this problem : first , we have to know the bitwise XOR in java

        0 ^ N = N
        N ^ N = 0
        So..... if N is the single number
        N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
        = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
        = 0 ^ 0 ^ ..........^ 0 ^ N
        = N
    */
    public static int singleNumber(int[] nums){
        int result = 0;
        
        for(int num : nums){
            result ^= num;
        }
        
        return result;
    }
    public static int singleNumberWithHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        
        for(int num : set){
            return num;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] input = {4, 1, 2, 1, 2};
        int output1 = singleNumberWithHashSet(input);
        System.out.println(output1);
        int output2 = singleNumber(input);
        System.out.println(output2);
    }
    
}
