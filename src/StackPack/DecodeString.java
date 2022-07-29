package StackPack;

import java.io.CharArrayReader;
import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(decodeString(str));
    }

    private static String decodeString(String s) {
        Stack<String> ss  = new Stack<>();
        Stack<Integer> sd = new Stack<>();
        int currNo = 0;
        String currStr = "";

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                currNo = 0;
                currNo = currNo * 10 + ch - '0';
            }

            else if(ch == '['){
                ss.push(currStr);
                sd.push(currNo);
                currStr = "";
                currNo = 0;
            }
            else if(ch == ']'){
                StringBuilder prevS = new StringBuilder(ss.pop());
                int prevN0 = sd.pop();
                for (int j = 1; j <=prevN0 ; j++) {
                    prevS.append(currStr);
                }
                currStr = prevS.toString();

            }else {
                currStr+=ch;
            }

        }
        return currStr;
    }
}
