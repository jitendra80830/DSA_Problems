package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromepartition {
    static int dp[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        int n = str.length();
        dp = new int[n+1][n+1];
        for (int row[] : dp){
            Arrays.fill(row , -1);
        }

        System.out.println(palindromePartition(ch , 0 ,n-1));
        System.out.println(palindromePartitionMemoization(ch , 0 ,n-1));
    }

    private static int palindromePartitionMemoization(char[] ch, int i, int j) {
        if(i >= j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(isPalindrome(ch , i ,j)){
            return 0;
        }
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            dp[i][j] = Math.min(dp[i][j] ,(1 + palindromePartitionMemoization(ch , i , k)
                    +palindromePartitionMemoization(ch , k+1 ,j)));

        }
        return dp[i][j];

    }

    private static int palindromePartition(char[] ch, int i, int j) {
        if(i >= j || isPalindrome(ch ,i , j)){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            min = Math.min(min , (1+palindromePartition(ch , i ,k) + palindromePartition(ch ,k+1 ,j)));

        }
        return min;
    }


    public static boolean isPalindrome( char ch[] ,int start , int end){

        while (start < end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
