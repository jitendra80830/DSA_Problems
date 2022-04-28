package DP;

import java.util.Arrays;
import java.util.Scanner;

public class minJumbReachEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp ,Integer.MAX_VALUE);
         System.out.println(minJumpReachEnd(arr , dp ,n));
    }

    private static int minJumpReachEnd(int[] arr, int[] dp, int n) {
        if(arr[0] == 0){
            return Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                if(dp[j]!=Integer.MAX_VALUE && arr[j]+j>=i){
                    if(dp[j] + 1 < dp[i]){
                        dp[i] = dp[j]+1;
                    }
                }

            }

        }
        if(dp[n-1]!=Integer.MAX_VALUE){
            return dp[n-1];
        }
        return -1;

    }
}
