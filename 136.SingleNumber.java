/*
  Question
  
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

  You must implement a solution with a linear runtime complexity and use only constant extra space.

 

  Example 1:
  Input: nums = [2,2,1]
  Output: 1
  Example 2:

  Input: nums = [4,1,2,1,2]
  Output: 4
  Example 3:

  Input: nums = [1]
  Output: 1

*/

// My Solution

import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        int singleNum = 0;

        int lastIndex = nums.length - 1;
        int i = 0;
        while(i < nums.length) {
            if(i != lastIndex && nums[i + 1] == nums[i]) 
                i += 2;
            else {
                singleNum = nums[i];
                break;
            }
        }
        return singleNum;
    }
}

/*

Basically for my approach I just sort the array then check to see if the value next to the value at the current position is equal. If it isn't we've found 
the non-duplicate value.

My solution's time complexity is O(N) where as the space complexity is O(1).

*/
