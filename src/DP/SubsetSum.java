package DP;

import java.util.Scanner;

public class SubsetSum {
    static boolean dp[][] = new boolean[1001][1001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;//sc.nextInt();
        int sum = 12; //sc.nextInt();
        int arr[] = {3,4,8,9,11};
        //int arr[] = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
        for (int i = 0; i <1001 ; i++) {
            for (int j = 0; j < 1001; j++) {
                dp[i][j] = false;
            }
        }

        if(subsetSumDP(arr ,n , sum)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean subsetSum(int[] arr, int n, int sum) { //recursion
        if(sum == 0){
            return true;
        }
        if (n == 0){
            return false;
        }

        if(arr[n-1] > sum){ // arr's value > sum then not included
            subsetSum(arr , n-1 , sum);
        }
            // both included or not included
         return   subsetSum(arr, n - 1, sum - arr[n - 1]) || subsetSum(arr, n - 1, sum);


    }
    private static boolean subsetSumDP(int[] arr, int n, int sum) { // dp
        if(sum == 0){
            return true;
        }
        if (n == 0){
            return false;
        }
        if(dp[n][sum]){
            return dp[n][sum];
        }
        if(arr[n-1] > sum){ // arr's value > sum then not included
            dp[n][sum] = subsetSumDP(arr , n-1 , sum);
        }else {
            // both included or not included
            dp[n][sum] =  subsetSumDP(arr, n - 1, sum - arr[n - 1]) ||
                    subsetSumDP(arr, n - 1, sum);
        }
        return dp[n][sum];
    }
}
