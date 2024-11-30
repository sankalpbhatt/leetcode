package org.example.easy.string;

/*
E.g.
Input ="bxd deeea"
Output = bxa
*/
public class RemoveDuplicate {

    public static void main(String [] a){
        removeDuplicate("bxd deeea");
    }

    public static void removeDuplicate(String s){
        StringBuilder finalOne = new StringBuilder();
        int [] traversed = new int[26];
        for(int i=0; i<=s.length()-1;i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            if(traversed[s.charAt(i)-'a'] == 0){
                finalOne.append(s.charAt(i));
                traversed[s.charAt(i)-'a'] = 1;
            }else{
                if(finalOne.charAt(finalOne.length()-1) == s.charAt(i)){
                    finalOne = new StringBuilder(finalOne.substring(0, finalOne.length() - 1));
                }
            }
        }
        System.out.println(finalOne);
    }
}
