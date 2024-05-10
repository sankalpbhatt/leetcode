package org.example.easy;

/**
 * Top 150 Interview question
 * Palindrome Number
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class IsPalindromeInt {

    public static void main(String [] a){
        IsPalindromeInt isPalindromeInt = new IsPalindromeInt();
        System.out.println( "121 is palindrome: "+isPalindromeInt.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        int res = 0;
        int n = x;
        while(n > 0){
            res = (res*10)+(n%10);
            n=n/10;
        }
        if( res == x ){
            return true;
        }
        return false;
    }

}
