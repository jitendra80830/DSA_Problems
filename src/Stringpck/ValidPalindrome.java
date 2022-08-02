package Stringpck;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                char c = Character.toLowerCase(ch);
                sb.append(c);
            }else if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String ans = "";
        ans = sb.toString();
       // System.out.println(ans);
        if(validPalindrome(ans)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validPalindrome(String ans) {
        int i =0;
        int j = ans.length()-1;
        while (i <= j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
