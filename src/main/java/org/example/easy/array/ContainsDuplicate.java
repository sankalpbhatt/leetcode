package org.example.easy.array;

public class ContainsDuplicate {

    public static void main(String [] a){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int [] arr = {1,2,3,1};
        System.out.println("[1,2,3,1] contains duplicate : "+ containsDuplicate.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
