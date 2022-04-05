package StackPack;

import java.util.Scanner;
import java.util.Stack;

public class BeautifulBraces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while( t>0){
            String str=sc.next();
            if(str.charAt(0)=='-'){
                break;
            }
            else{
                System.out.print(t+ ". ");
                beautifulBraces(str);
            }
            t++;
            System.out.println("");
        }
//        String str = sc.next();
//        beautifulBraces(str);
    }

    private static void beautifulBraces(String str) {
        Stack<Character> st = new Stack<>();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                st.push('{');
            } else if(str.charAt(i) == '}'){


                if (!st.isEmpty()) {
                    st.pop();
                }else {
                    counter++;
                    st.push('{');
                }
            }
        }
        if (st.size()!=0){
            counter+=st.size()/2;
        }
        System.out.println(counter);
    }
}
