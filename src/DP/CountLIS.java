package DP;

import java.util.Scanner;

public class CountLIS {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(lengthOfLIS(nums));
    }

    private static int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int maxOv = countLIS(dp , nums);
        for (int i = 0; i < dp.length ; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        int countLIS = 0;
        for (int i = 0; i < dp.length ; i++) {
            if(dp[i] == maxOv){
                countLIS++;
            }
        }
        return countLIS;


    }

    private static int countLIS(int[] dp, int[] nums) {
        int maxOv = 0;
        for (int i = 0; i <nums.length ; i++) {
            int max = 0;
            for (int j = 0; j <i ; j++) {
                if(nums[j] < nums[i]){
                    if(max < dp[j]){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
            if(dp[i] > maxOv){
                maxOv = dp[i];
            }
        }
        return maxOv;
    }
}
