package Stringpck;

import java.util.Scanner;

public class FirstPalyndrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        System.out.println(firstPalindrome(str));
    }

    private static String firstPalindrome(String[] words) {
        String ans = "";
        for (int i = 0; i < words.length ; i++) {
            if(isPalymdrome(words[i])){
                ans = words[i];
                break;
            }
        }
        return ans;
    }

    private static boolean isPalymdrome(String word) {
        int i = 0;
        int j = word.length() -1;
        while (i <= j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
