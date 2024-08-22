package Stringpck;
/*
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".

if above any one condition is true then return true otherwise false
*/

import java.util.Scanner;

public class Detect_Capital {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        if((checkUpperCase(word)) || checkLowerCase(word)){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && checkLowerCase(word.substring(1))){
            return true;
        }
        return false;
    }

    private static boolean checkLowerCase(String word) {
        for (int i = 0; i <word.length() ; i++) {
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean checkUpperCase(String word) {
        for (int i = 0; i <word.length() ; i++) {
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
