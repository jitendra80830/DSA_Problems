package Stringpck;

import java.util.Scanner;

public class RevrseOnlyVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(reverseVowels(str));
    }

    private static String reverseVowels(String str) {
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i <= j){
            if(isVowel(ch , i) && isVowel(ch ,j)){
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
                i++;
                j--;
            }else if(!isVowel(ch ,i)){
                i++;
            }else if(!isVowel(ch , j)){
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < ch.length ; k++) {
            sb.append(ch[k]);
        }
        String ans = "";
        ans = sb.toString();

        return ans;
    }
    public static boolean isVowel(char ch[] , int index){
        if(ch[index] =='a'|| ch[index] =='e' || ch[index] =='i' || ch[index] =='o'|| ch[index] =='u' ||
                ch[index] =='A'|| ch[index] =='E' || ch[index] =='I' || ch[index] =='O'|| ch[index] =='U'){
            return true;
        }
        return false;
    }
}
