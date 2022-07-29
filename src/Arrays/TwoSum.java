package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans []  = twoSum(arr ,target);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i] +" ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
