package DP;

import java.util.Scanner;

public class UniquePtha2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int grid[][] = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(uniquePaths(grid));

    }

    private static int uniquePaths(int grid[][]) {
        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][0] ==1){
            return 1;
        }
        int dp[][] = new int[m][n];
        for (int i = 0; i <n ; i++) {
            if(grid[0][i] == 1){
                break;
            }else {
                dp[0][i] = 1;
            }
        }
        for (int i = 0; i <m ; i++) {
            if(grid[i][0] == 1){
                break;
            }else {
                dp[i][0] = 1;
            }
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                if(grid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
