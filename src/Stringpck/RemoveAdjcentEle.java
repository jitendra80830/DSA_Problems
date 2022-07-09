package Stringpck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveAdjcentEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        //"abbaca"
        removeAdjecent(str);
    }

    private static void removeAdjecent(String str) {

        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
        }
        for (int i = 0; i <26 ; i++) {
            if(freq[i] %2!=0){
                System.out.print((char) (i+ 'a'));
            }
        }
    }
}
