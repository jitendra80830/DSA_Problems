package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Combination_Sum_IV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int  ques[] = new int[n];
        for (int i = 0; i <n ; i++) {
            ques[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(combinationSum4(ques  , target));
    }

    private static int combinationSum4(int[] nums, int target) {//recursion


//        int count = combinationSum(nums , target , 0);
//        return count;
        int dp[] = new int[target + 1];
        Arrays.fill(dp , -1);
        return combinationSumMem(nums , target , dp);
    }

    private static int combinationSum(int[] ques, int target, int ans) {

        if(target == 0){
            return 1;

        }
        int res = 0;
        for (int i = 0; i <ques.length ; i++) {

            if(target >= ques[i]) {
                res += combinationSum(ques, target - ques[i], ans + ques[i]);
            }
        }
        return res;
    }
    public static int combinationSumMem(int ques[] , int target , int dp[]){
        if(target < 0){
            return 0;
        }
        if (target == 0){
            return 1;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i < ques.length ; i++) {
            res+= combinationSumMem(ques , target - ques[i] , dp);
        }
        dp[target] = res;
        return dp[target];
    }
}
