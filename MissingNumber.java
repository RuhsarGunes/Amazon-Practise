/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note: Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?
*/
package missingnumber;

import java.util.HashSet;

public class MissingNumber {

    //Gauss law : 1, 2, 3...., n => sum : n*(n+1)/2
    public static int missingNumber(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        
        int n = nums.length + 1;
        return n*(n-1)/2 - sum;
    }
    public static int missingNumberWithHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i))
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
    
}
