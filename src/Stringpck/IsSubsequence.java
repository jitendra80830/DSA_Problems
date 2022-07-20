package Stringpck;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isSubsequence(s ,t));
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i<s.length()){
            char sChar = s.charAt(i);

            while (j < t.length()) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    count++;
                    j++;
                    break;

                }
                j++;
            }
            i++;
        }
        if(count == s.length()){
            return true;
        }else {
            return false;
        }
    }
}
