package DP;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;//sc.nextInt();
        int sum = 12; //sc.nextInt();
        int arr[] = {3,4,8,9,11};
        //int arr[] = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }

        if(subsetSum(arr ,n , sum)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean subsetSum(int[] arr, int n, int sum) {
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
        return subsetSum(arr  , n-1 , sum - arr[n-1]) || subsetSum(arr , n-1  , sum);
    }
}
