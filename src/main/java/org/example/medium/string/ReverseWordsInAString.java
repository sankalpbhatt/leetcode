package org.example.medium.string;

import java.util.HashMap;

public class ReverseWordsInAString {

    public static void main(String [] a){
        ReverseWordsInAString reverseWord = new ReverseWordsInAString();
        System.out.println(reverseWord.reverseWords("Here is one"));
    }

    public String reverseWords(String s) {
        int j = s.length()-1;
        StringBuilder str = new StringBuilder();
        for(int i =s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' ' || i == 0){
                str.append(s.substring(i, j+1).trim());
                j=i-1;
                str.append(" ");
            }
        }
        return str.toString().trim();
    }
}
