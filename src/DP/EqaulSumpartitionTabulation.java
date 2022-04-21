package DP;

import java.util.Scanner;

public class EqaulSumpartitionTabulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        if(sum%2!=0){
            System.out.print("NO");
        }else {
            boolean dp[][] = new boolean[n+1][sum/2+1];

            for (int i = 0; i <n+1 ; i++) {
                dp[i][0] = true;
            }
            for (int j = 0; j <sum/2+1 ; j++) {
                dp[0][j] = false;
            }
            for (int i = 1; i <n+1 ; i++) {
                for (int j = 1; j <sum/2+1 ; j++) {
                    if(arr[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }else {
                        dp[i][j] = dp[i-1][j- arr[i-1]] || dp[i-1][j];
                    }

                }

            }
            if(dp[n][sum/2]){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
