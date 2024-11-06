package org.example.medium.string;

public class ReverseWord {

    public static void main(String [] a){
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseWords("Here is one"));
    }

    public String reverseWords(String s) {
        int j = 0;
        StringBuilder str = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ' ' || i==s.length()-1){
                str.append(reverse(s.substring(j, i + 1).trim()));
                j=i+1;
                str.append(" ");
            }
        }
        return str.toString();
    }

    public String reverse(String str){
        StringBuilder reverseStr = new StringBuilder();
        for(int i =str.length()-1; i>=0; i--){
            reverseStr.append(str.charAt(i));
        }
        return reverseStr.toString();
    }
}
