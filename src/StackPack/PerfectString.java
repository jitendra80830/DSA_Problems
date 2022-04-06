package StackPack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PerfectString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            //prepzAaZbytes
            //String str1 = str.toLowerCase();
            //System.out.println(str1);
            perfectString(str);
        }
    }

    private static void perfectString(String str) {
        //int n = str.length();
        Stack<Character> st = new Stack<>();
        char ch[] = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if(st.isEmpty() || st.peek()!=ch[i]){
                st.push(ch[i]);
            }else {
                st.pop();
            }

        }
        String ans = "";
        while (!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        reverseString(ans);
//        int start = 0;
//        int end = ans.length()-1;
//        char charArr[] = ans.toCharArray();
//        while(start < end){
//            char temp = ch[start];
//            charArr[start] = charArr[end];
//            charArr[end] = charArr[temp];
//        }
//        for (int i = 0; i <charArr.length ; i++) {
//            System.out.print(charArr[i]+" ");
//        }

    }
    private static void reverseString(String str) {
        char chArr[] = str.toCharArray();
        int last = str.length()-1;
        int half = str.length() /2;
        for (int i = 0; i <half ; i++) {
            char temp = chArr[i];
            chArr[i] = chArr[last - i];
            chArr[last -i] = temp;
        }
        for (int i = 0; i <chArr.length ; i++) {
            System.out.print(chArr[i]);

        }

    }
}
