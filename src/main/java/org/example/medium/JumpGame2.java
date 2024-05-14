package org.example.medium;

/**
 * Top 150 Interview question
 * 45. Jump Game II
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 *
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 */
public class JumpGame2 {

    public static void main(String [] jumps){
        JumpGame2 jumpGame2 = new JumpGame2();
        int [] arr = {1,3,1,1,1}; // <-- Pass you test sample here
        System.out.println( "Number of jumps "+ jumpGame2.jump(arr));
    }

    public int jump(int[] nums) {
        int minJumpToEnd = 0;
        int end=0;
        int max =0;
        for (int i = 0; i < nums.length - 1; ++i) {
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) {
                ++minJumpToEnd;
                break;
            }
            if (i == end) {
                ++minJumpToEnd;
                end = max;
            }
        }
        return minJumpToEnd;
    }
}
