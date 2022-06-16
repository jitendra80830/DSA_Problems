package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(infixToPostfix(str));
    }

    private static String infixToPostfix(String str) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                ans+=ch;
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while (!st.isEmpty() && st.peek() != '('){
                    ans+=st.pop();
                }
                st.pop();
            }else {
                while (!st.isEmpty() && Prec(ch) <= Prec(st.peek())){

                    ans+=st.pop();
                }
                if(ch!='(') {
                    st.push(ch);
                }
            }

        }
        while (!st.isEmpty() ){
//            if(st.peek() == '(')
//                return "invalid ex";

            ans+=st.pop();
        }
        return ans;


    }
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
                return 1;
            case '-':
                return 2;

            case '*':
                return 3;
            case '/':
                return 4;

            case '^':
                return 5;
        }
        return -1;
    }
}
//abcd^e-fgh*+^*i-+