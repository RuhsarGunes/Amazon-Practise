/*Given a sorted (in ascending order) integer array nums of n elements 
and a target value,  write a function to search target in nums.
If target exists, then return its index, otherwise return -1.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1*/
package binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 3, 5, 9, 12};
        int indice1 = binarySearch(arr1, 9);
        int indice2 = binarySearch(arr1, 2);
        
        System.out.println(indice1);
        System.out.println(indice2);
    }   
    
}
