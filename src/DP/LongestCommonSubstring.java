package DP;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = str1.length();
        int m =str2.length();
      // System.out.println(longestCommonSubstringRec(str1 , str2 , n , m, 0)); //wrong output
        int dp[][] = new int[n+1][m+1];
        for (int row[] : dp){
            Arrays.fill(row , -1);
        }
        for (int i = 0; i <n+1 ; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m+1; j++) {
            dp[0][j] = 0;
        }
        int result = 0;
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    result = Math.max(result , dp[i][j]);
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(result);
    }

    private static int longestCommonSubstringRec(String str1, String str2, int n, int m, int len) {
        if(n ==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            len = 1 + longestCommonSubstringRec(str1 , str2,n-1 ,m-1,len);
        }else {
            Math.max(len , Math.max(longestCommonSubstringRec(str1 ,str2,n-1,m,0) ,
                    longestCommonSubstringRec(str1 ,str2 ,n , m-1 ,0)));
        }
        return len;
    }
}
