package Stringpck;

import java.util.Scanner;

public class ReverceOnlyChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseOnlyLetters(str));
    }

    private static String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length -1;
        while (i <= j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
                i++;
                j--;
            }else if(!Character.isLetter(ch[i])){
                i++;
            }else if(!Character.isLetter(ch[j])){
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k <ch.length ; k++) {
            sb.append(ch[k]);
        }
        String ans = "";
        ans = sb.toString();
        return ans;
    }
}
//j-Ih-gfE-dCba