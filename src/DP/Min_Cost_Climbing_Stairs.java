package DP;

import java.util.Scanner;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost[] = new int[n];
        for (int i = 0; i <n ; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2] );
        }
        return Math.min(dp[cost.length -2],dp[cost.length-1]);
    }
}
