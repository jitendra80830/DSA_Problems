package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class CmpileCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n  = sc.nextInt();
        String str = sc.next();
        Stack<Character> st = new Stack<>();
        int ans = 0;
        int current = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == '<'){
                st.push('<');

            }else {
                if(!st.isEmpty()){
                    current+=2;
                    st.pop();
                    if(st.isEmpty()){
                        ans+=current;
                        current = 0;
                    }
                }else {
                    break;
                }
            }

        }
        System.out.println(ans);

    }
}
