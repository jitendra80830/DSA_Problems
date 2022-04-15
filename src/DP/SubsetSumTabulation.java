package DP;

import java.util.Scanner;

public class SubsetSumTabulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean dp[][] = new boolean[n+1][sum+1];

        for (int i = 0; i <n+1 ; i++) { //1st row filling true
            dp[i][0] = true;
        }
        for (int j = 1; j <sum+1 ; j++) { // 1st column filling false
            dp[0][j] = false;
        }
        for (int i = 1; i <n+1 ; i++) { //for n varie i
            for (int j = 1; j <sum+1 ; j++) { // for sum varie j
                if(arr[i -1] > j){
                    dp[i][j] =dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                }

            }

        }
        if(dp[n][sum]){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
    }
}
