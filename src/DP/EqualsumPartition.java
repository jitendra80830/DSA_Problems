package DP;

import java.util.Scanner;

public class EqualsumPartition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        if(sum % 2!=0){
            System.out.println("NO");
        }else {
            if(subsetSum(arr ,n ,sum/2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }

    private static boolean subsetSum(int[] arr, int n, int sum) {
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(arr[n-1] > sum){
            return subsetSum(arr ,n-1 , sum);
        }
        return subsetSum(arr , n-1 , sum - arr[n-1]) || subsetSum(arr , n-1 , sum);
    }
}
