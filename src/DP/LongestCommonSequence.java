package DP;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSequence {
    static int dp[][];
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str1 ="aecd";// sc.next();
        String str2 = "baed";//sc.next();
        int n = str1.length();
        int m = str2.length();
        dp = new int[n+1][m+1];
        for (int[] row : dp){
            Arrays.fill(row , -1);
        }
        System.out.println(lcsMemoization(str1 , str2 , n , m));
        System.out.println(lcs(str1 , str2 , n , m));
        System.out.println(lcsTabilation(str1 , str2 , n , m));
    }

    private static int lcsTabilation(String str1, String str2, int n, int m) {
        int dp[][] = new int[n+1][m+1];
        for (int[] row : dp){
            Arrays.fill(row,-1);
        }
        for (int i = 0; i <n+1 ; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <m+1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else {
                    dp[i][j] =Math.max(dp[i-1][j] , dp[i][j-1]);
                }

            }
        }
        return dp[n][m];
    }

    private static int lcsMemoization(String str1, String str2, int n, int m) {
        if(n ==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){ // not equal to 1 means value already calculated simple return that value not need to call fun
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = 1+lcsMemoization(str1 ,str2 , n-1 ,m-1);
        }else {
            dp[n][m] = Math.max(lcsMemoization(str1, str2, n - 1, m), lcsMemoization(str1, str2, n, m - 1));
        }
        return dp[n][m];
    }

    private static int lcs(String str1, String str2, int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return 1 + lcs(str1 , str2 , n-1 , m-1);
        }else {
            return Math.max(lcs(str1 , str2 , n-1 ,m)
                    ,lcs(str1,str2 ,n,m-1));
        }
    }
}
