package Arrays;

import java.util.Scanner;

public class FindPivotEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        int lSum = 0;
        int rSum = sum;

        for (int i = 0; i < nums.length ; i++) {
            rSum = rSum - nums[i];
            if(lSum == rSum){
                return i;
            }
            lSum = lSum + nums[i];
        }
        return -1;
    }
}
