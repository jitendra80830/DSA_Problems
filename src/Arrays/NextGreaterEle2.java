package Arrays;

import java.util.Scanner;

public class NextGreaterEle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
       int arr[] =  findNextGreaterEle(nums);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] findNextGreaterEle(int[] nums) {//wrong ams,we have to calculate by circuler way
        int n = nums.length;
        int ans[] = new int[n];
        for (int i = 0; i <n ; i++) {
            int flag = 0;
            for (int j = i+1; j <n ; j++) {
                if(nums[j] > nums[i]){
                    ans[i] = nums[j];
                    flag = 1;
                    break;
                }
            }
            if(flag ==0){
                ans[i] = -1;
            }
        }
        return ans;
    }
}
