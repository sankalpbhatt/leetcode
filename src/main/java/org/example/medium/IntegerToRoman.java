package org.example.medium;

/**
 * Top 150 Interview question
 * 12. Integer to Roman
 */
public class IntegerToRoman {

    public static void main(String [] integerToRoman){
        IntegerToRoman intToRoman = new IntegerToRoman();
        int number = 3345; // Pass the number here who you want to convert
        System.out.println( "Roman for "+ number+" = " + intToRoman.intToRoman(number));;
    }

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder solution = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= values[i]) {

                solution.append(romanNumerals[i]);
                num -= values[i];
            } else {
                i++;
            }
        }
        return solution.toString();
    }
}
