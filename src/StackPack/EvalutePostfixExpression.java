package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class EvalutePostfixExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Long> st = new Stack<>();
        for (int i = 0; i <n ; i++) {
            String str = sc.next();
            long x = 0;
            long y = 0;

            if(str.equals("+")|| str.equals("-") || str.equals("*") || str.equals("/")){
                if(str.equals("+")){
                    x = st.pop();
                    y = st.pop();
                    st.push(x+y);
                }else if(str.equals("-")){
                    x = st.pop();
                    y = st.pop();
                    st.push(y-x);
                }else if(str.equals("*")){
                    x = st.pop();
                    y = st.pop();
                    st.push(x*y);
                }else if(str.equals("/")){
                    x = st.pop();
                    y = st.pop();
                    st.push(y/x);
                }

            }else{
                long item = Integer.valueOf(str);
                st.push(item);

            }


        }
        System.out.println(st.pop());

    }

    private static int portfixResult2(String str) {
        Stack<Integer> st = new Stack<>();
        char[] ch = str.toCharArray();
        int x =0;
        int y = 0;
        for(char c : ch){
            if(c >= '0' && c <='9'){
                st.push((int)(c - '0'));
            }else {
                x = st.pop();
                y = st.pop();
                switch (c){
                    case '+':
                        st.push(x+y);
                        break;
                    case '-':
                        st.push(x -y);
                        break;
                    case '*':
                        st.push(x*y);
                        break;
                    case '/':
                        st.push(x/y);
                        break;
                }
            }
        }
        return st.pop();

    }
}
