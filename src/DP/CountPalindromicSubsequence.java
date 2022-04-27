package DP;

import java.util.Scanner;

public class CountPalindromicSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean dp[][] = new boolean[str.length()][str.length()];
        int counter = 0;
        for (int gap = 0; gap <str.length() ; gap++) {
            for (int i = 0 ,j  =gap; j < dp.length; i++ ,j++) {
                if(gap ==0){
                    dp[i][j] = true;
                }else if(gap ==1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = false;
                    }
                }else {
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true){
                    counter++;
                }
                
            }

        }
        System.out.print(counter);
    }
}
