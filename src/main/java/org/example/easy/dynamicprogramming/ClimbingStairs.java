package org.example.easy.dynamicprogramming;

/**
 * Problem number 70
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String [] a){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("We can climb 10 stairs in "+climbingStairs.climbStairs(10)+" ways");
    }

    public int climbStairs(int n) {
        int secondLast = 1;
        int last = 1;
        for(int i = 2; i<=n; i++){
            int temp = secondLast;
            secondLast = secondLast+last;
            last = temp;
        }
        return secondLast;
    }
}
