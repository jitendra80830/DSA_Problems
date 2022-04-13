package DP;

import java.util.Scanner;

public class StairClimbProblrm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairs(n)); //not optimize tc = exponetial
        System.out.println(stairs2(n)); //using DP
    }

    private static int stairs2(int n) {
        int  stairs[] = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;
        for (int i = 2; i <=n; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }

    private static int stairs(int n) {
        if(n < 0){
            return 0;
        }
        if(n == 0 || n==1){
            return 1;
        }
        return stairs(n-1) + stairs(n-2);
    }
}
