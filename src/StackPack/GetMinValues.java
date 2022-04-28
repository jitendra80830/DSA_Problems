package StackPack;

import java.util.Scanner;

public class GetMinValues {
    static int minVal;
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int k = sc.nextInt();
            if (k == 1) {
                int x = sc.nextInt();
                Push(x);
            } else if (k == 2)
                Pop();
            else if (k == 3)
                System.out.println(Top());
            else if (k == 4)
                System.out.println(minimum());

        }
    }
    static void Push(int x) throws Exception {
        if (st.isEmpty()==true) {
            st.push(x);
            minVal = x;
        }
        else if (x > minVal) {
            st.push(x);
        }
        else {
            st.push(2 * x - minVal);
            minVal = x;
        }
    }
    static void Pop() throws Exception {
        if (st.isEmpty()==true) {
            System.out.println("-1");
        }
        else{
            int top = st.peek();
            if (top < minVal)
                minVal = 2 * minVal - top;
            st.pop();
        }
    }
    static int minimum()
    {
        if(!st.isEmpty()==true)
            return minVal;
        else
            return -1;
    }
    static int Top() throws Exception {
        if(st.isEmpty()==true)
            return -1;
        else{
            int t = st.peek(); // Top element.
            // If t < minEle means minEle stores
            // value of t.
            return (t < minVal)? minVal:t;
        }
    }
}
