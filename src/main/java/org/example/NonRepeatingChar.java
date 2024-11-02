package org.example;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String [] a){
        NonRepeatingChar nonRepeatingChar = new NonRepeatingChar();
        nonRepeatingChar.findFirstNonRepeatingChar("Google");
    }

    public void findFirstNonRepeatingChar(String str){
        Map<String, Integer> frequency = new HashMap<>();
        for( int i =0; i< str.length(); i++){
            String s = String.valueOf(str.charAt(i)).toLowerCase();
            if( frequency.containsKey(s) ){
                frequency.put(s, frequency.get(s)+1);
            }else{
                frequency.put(s, 1);
            }
        }
        for( int i =0; i< str.length(); i++){
            String s = String.valueOf(str.charAt(i)).toLowerCase();
            if( frequency.containsKey(s) && frequency.get(s) == 1){
                System.out.println("First non repeating character is : "+ str.charAt(i));
                break;
            }
        }

    }
}
