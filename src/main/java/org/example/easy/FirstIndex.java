package org.example.easy;

/**
 * Find the Index of the First Occurrence in a String
 */
public class FirstIndex {

    /**
     * Solution method
     */
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        for( int i=0; i<=haystack.length()-needle.length(); i++ ){
            if( haystack.charAt(i) == needle.charAt(0) ){
                if( needle.length() ==1 || haystack.substring( i, i+needle.length() ).equals( needle ) ){
                    return i;
                }
            }
        }
        return -1;
    }
}
