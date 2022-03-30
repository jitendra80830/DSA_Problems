package Stringpck;

import java.util.Scanner;

public class MakePalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(makePalindrome(str));

    }

    private static int makePalindrome(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i <n/2 ; i++) {
            res+= Math.abs(str.charAt(i) - str.charAt(n-i-1));

        }
        return res;
    }
}
