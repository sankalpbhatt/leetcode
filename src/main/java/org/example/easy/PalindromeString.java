package org.example.easy;

import java.io.Serializable;

/**
 * 125. Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class PalindromeString implements Serializable {

    public static void main(String [] a){
        String str = "ab2a";
        PalindromeString p = new PalindromeString();
        System.out.println("p.isPalindrome(str) = "+p.isPalindrome(str));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for(int i=0, j=s.length()-1; i<j; ){
            if(s.charAt(i)<96 || s.charAt(i)>122) {
                if(!(s.charAt(i)>47 && s.charAt(i)<58)){
                    System.out.println("Incrementing j");
                    i++;
                    continue;
                }
            }
            if(s.charAt(j)<96 || s.charAt(j)>122) {
                if(!(s.charAt(i)>47 && s.charAt(i)<58)){
                    System.out.println("Decrementing j");
                    j--;
                    continue;
                }
            }
            System.out.println((s.charAt(i) + "==" + s.charAt(j)) +" = "+(s.charAt(i) == s.charAt(j)) );
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
