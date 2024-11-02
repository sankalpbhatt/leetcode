package org.example.hard;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int i =0, j=0;
        char currentChar = Character.MIN_VALUE;;
        char prevChar  = Character.MIN_VALUE;;
        char prevMatchChar  = Character.MIN_VALUE;;
        boolean isMatch = true;
        boolean skipCurrent = false;
        if(s.equals(p)){
            return true;
        }
        for (; i < s.length() && j<p.length();) {
            if( !skipCurrent && s.charAt(i) == p.charAt(j) ){
                i++;
                j++;
                skipCurrent = false;
            }else if( skipCurrent && s.charAt(i) == prevChar ){
                i++;
            }else if( skipCurrent && s.charAt(i) != prevChar ){
                isMatch = false;
                break;
            }else{
                if(p.charAt(j) == '.'){
                    prevMatchChar = p.charAt(j);
                    i++;
                    j++;
                }else if(p.charAt(j) == '*'){
                    skipCurrent = true;
                    prevChar = s.charAt(i);
                }
            }
        }
        if(i != s.length()){
            return false;
        }
        return isMatch;
    }

}
