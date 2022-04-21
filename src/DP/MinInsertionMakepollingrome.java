package DP;

import java.util.Arrays;
import java.util.Scanner;

public class MinInsertionMakepollingrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str  = sc.next();
        StringBuilder str2 = new StringBuilder();
//        for (int i = str.length()-1; i>=0 ; i--) {
//            str2.append(str.charAt(i));
//        }
        str2.append(str);
        str2.reverse();
        int n  = str.length();
        int m = str2.length();
        //System.out.println(str+" \n"+str2);
        int dp[][] = new int[n+1][m+1];
        for (int row[] : dp){
            Arrays.fill(row,-1);
        }
//        for (int i = 0; i <n+1 ; i++) {
//            for (int j = 0; j < m+1; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        for (int i = 0; i <n+1 ; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <m+1 ; j++) {
            dp[0][j] = 0;
        }
//        for (int i = 0; i <n+1 ; i++) {
//            for (int j = 0; j < m+1; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if(str.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else {
                    dp[i][j] =Math.max(dp[i-1][j] , dp[i][j-1]);
                }

            }
        }


        int lps = dp[n][m];
        System.out.println(len - lps);
        //System.out.println(dp[n][m]);
    }
}
