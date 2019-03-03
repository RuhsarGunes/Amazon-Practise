/*Given an array of integers, return indices of the two numbers such that
they add up to a specific target. You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]*/

package twosum;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] output = {-1, -1};
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                output[1] = i;
                output[0] = hashMap.get(diff);  
                return output;
            }
            hashMap.put(nums[i], i);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums,target);
        for(int i : result){
            System.out.println(i);
        }
    }
    
}
