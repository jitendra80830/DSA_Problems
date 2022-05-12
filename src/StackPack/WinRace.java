package StackPack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class WinRace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if(st.size() == 0){
                list.add(-1);
            }
            else if(st.size() > 0 && st.peek() < arr[i]){
                list.add(st.peek());
            }
            else if(st.size() > 0 && st.peek() >= arr[i]){
                while (st.size() > 0 && st.peek() >= arr[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    list.add(-1);
                }else {
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
