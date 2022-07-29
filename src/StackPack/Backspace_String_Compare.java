package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        String t = sc.next();
        System.out.println(backspaceCompare(s , t));
    }

    private static boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
           if(s.charAt(i) == '#' && !s1.isEmpty()){
               s1.pop();
           }else {
               if(s.charAt(i)!='#') {
                   s1.push(s.charAt(i));
               }
           }
        }
        for (int i = 0; i <t.length() ; i++) {
            if(t.charAt(i) == '#' && !t1.isEmpty()){
                t1.pop();
            }else {
                if(t.charAt(i)!='#') {
                    t1.push(t.charAt(i));
                }
            }
        }
        String s2 = "";
        while (!s1.isEmpty()){
            s2 = s2 + s1.peek();
            s1.pop();
        }
        String t2 = "";
        while (!t1.isEmpty()){
            t2 = t2 + t1.peek();
            t1.pop();
        }
        if(s2.equals(t2)){
            return true;
        }else {
            return false;
        }
    }
}
