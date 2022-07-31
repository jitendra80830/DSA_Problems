package DP;

import java.util.Scanner;

public class MaximumSumpath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int grid[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(minPathSum(grid));
    }

    private static int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        if(grid == null || n == 0){
            return 0;
        }
        if(n ==1 && m == 1){
            return grid[0][0];
        }
        int dp[][] = new int[n][m];


        dp[0][0] = grid[0][0];
        for (int i = 1; i <m; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i <n ; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                dp[i][j] = grid[i][j]  + Math.min(dp[i][j-1] ,dp[i-1][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
