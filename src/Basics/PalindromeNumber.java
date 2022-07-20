package Basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(checkPalindrome(x));
    }

    private static boolean checkPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x < 0 || x%10 ==0){
            return false;
        }
        int reverseX = 0;
        while (x > reverseX){
            int lastNumber = x %10;
            x/=10;
            reverseX = (reverseX * 10) + lastNumber;
        }
        if(x == reverseX || x == reverseX /10){
            return true;
        }else {
            return false;
        }
    }
}
