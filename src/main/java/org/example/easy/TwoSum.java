package org.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution to : https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class TwoSum {

    public static void main(String [] a){
        TwoSum twoSum = new TwoSum();
        int [] test1 = {2,7,11,15};
        int target1 = 13;
        int [] solution1 = twoSum.twoSum(test1, target1);
        System.out.println("Solution for test1 is : "+solution1[0]+" and "+ solution1[1]);

        int [] test2 = {};
        int target2 = 13;
        int [] solution2 = twoSum.twoSum(test2, target2);
        System.out.println("Solution for test1 is : "+solution2[0]+" and "+ solution2[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] finalIndex = new int[2];
        if( nums.length == 0 || nums.length == 1 ){
            return finalIndex;
        }
        if( nums.length == 2){
            if( nums[0] + nums[1] == target  ){
                finalIndex[1] = 1;
            }
            return finalIndex;
        }
        for ( int i =0; i<nums.length; i++ ){
            if( map.containsKey( target - nums[i]  ) ){
                finalIndex[0]= map.get( target - nums[i]  );
                finalIndex[1]= i;
                return finalIndex;
            }
            map.put(nums[i], i);
        }
        return finalIndex;
    }
}