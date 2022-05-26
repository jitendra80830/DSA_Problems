package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class SmallestPossible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
       // smallestPossibleNum(num , k);
    }

//    private static void smallestPossibleNum(String num, int k) {
//        Stack<Character> st = new Stack<>();
//        for (int i = num.length()-1; i>=0 ; i--) {
//            st.push(num.charAt(i));
//        }
//        int flag = 0;
//        char popkVal = st.pop();
//        for (int i = 0; i <k ; i++) {
//            if(st.peek() > popkVal){
//                flag = 1;
//                st.pop();
//            }
//        }
//        if(flag ==0 && st.peek() == 0){
//            st.pop();
//        }else {
//            st.push(popkVal);
//        }
//        //System.out.print(st);
//        while (!st.isEmpty()){
//            System.out.print( st.pop() - '0');
//        }
//    }
}
