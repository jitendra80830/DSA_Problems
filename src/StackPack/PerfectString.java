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
            if(!st.isEmpty() && (Math.abs(st.peek() - ch[i]) == 32)){
                st.pop();
            }else {
                st.push(ch[i]);
            }

        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        reverseString(ans);
        //System.out.println();
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
    private static void reverseString(StringBuilder str) {

       // StringBuilder sb = str.toString();
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse.append(str.charAt(i));
        }
        for (int i = 0; i <reverse.length() ; i++) {
            System.out.print(reverse.charAt(i));
        }
        System.out.println();

    }
}
