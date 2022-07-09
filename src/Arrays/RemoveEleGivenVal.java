package Arrays;

import java.util.Scanner;

public class RemoveEleGivenVal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        removeElement(arr,val);
    }

    private static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int i =0;
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
