package DP;

import java.util.Arrays;
import java.util.Scanner;

//Matrix Chain Multiplication
public class MCM {
    static int dp[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;//sc.nextInt();
        //int arr[] = new int[n];
        int arr[] = {2,3,5,6,7};
//        for (int i = 0; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
        int min = Integer.MAX_VALUE;
        dp =new int[n+1][n+1];
        System.out.println(mcm(arr ,1 ,n-1,min));
        for (int row[] : dp){
            Arrays.fill(row ,-1);
        }
        System.out.println(mcmMemoization(arr ,1 , n-1));
    }

    private static int mcmMemoization(int[] arr, int i, int j) {
        if(i >= j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            dp[i][j] = Math.min(dp[i][j] , (mcmMemoization(arr,i,k) + mcmMemoization(arr ,k+1 ,j) +
                    (arr[i-1]*arr[k]*arr[j])));

        }
        return dp[i][j];
    }

    private static int mcm(int[] arr, int i, int j, int min) {
        if(i >= j){
            return 0;
        }
        for (int k = i; k <j ; k++) {
            int ans = mcm(arr , i , k ,min) + mcm(arr , k+1 ,j,min)
                    + arr[i-1]*arr[k]*arr[j];
            if(ans < min){
                min = ans;
            }
        }
        return min;
    }
}
