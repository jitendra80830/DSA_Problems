package StackPack;

import java.util.Scanner;

public class ClientTwoStackOneArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        TwoStackOneArray sa = new TwoStackOneArray(n);
        int stack1 = sc.nextInt();
        int stack2 = sc.nextInt();
        int ele;
        for (int i = 0; i <stack1; i++) {
            ele = sc.nextInt();
            sa.push1(ele);
        }
        for (int i = 0; i <stack2 ; i++) {
            ele = sc.nextInt();
            sa.push2(ele);
        }
        System.out.println("Stack1 : ");
        sa.print1();
        System.out.println("Stack2 : ");
        sa.print2();

        sa.push1(15);

        int num = sa.top1+1;
        while (num!=0){
            sa.pop1();
            num--;
        }
        sa.pop1();
    }
}
