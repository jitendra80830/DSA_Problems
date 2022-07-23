package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjcentChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        Stack<Character> s  = new Stack<>();
        int n = str.length();
        for (int i = 0; i <n ; i++) {
            if(s.isEmpty()){
                s.push(str.charAt(i));
            }else {
                if (str.charAt(i) == s.peek()){
                    s.pop();
                }else{
                    s.push(str.charAt(i));
                }
            }
        }
        String ans = "";
        String temp = "";
        while (!s.isEmpty()){
            temp = temp + s.peek();
            s.pop();
        }
        for (int i = temp.length() -1; i >=0; i--) {
            ans =  ans+temp.charAt(i);
        }

        return ans;
    }
}
