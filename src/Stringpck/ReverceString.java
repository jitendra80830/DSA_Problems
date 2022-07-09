package Stringpck;

import java.util.Scanner;

public class ReverceString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        reverseString(chars);
    }

    private static void reverseString(char[] chars) {
        int last = chars.length-1;
        int half = chars.length/2;
        for (int i = 0; i <half ; i++) {
            char temp = chars[i];
            chars[i] = chars[last-i];
            chars[last-i] = temp;
        }
        System.out.println(chars);
    }
}
