package Stringpck;

import java.util.Scanner;

public class MakePolindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    }
    public static void makePalindrome(String str){
        int len = str.length();
        int count = 0;
        for (int i =0;i<len/2;i++){
            count += Math.abs(str.charAt(i) - str.charAt(len-i-1));

        }
        System.out.println(count);

    }
}
