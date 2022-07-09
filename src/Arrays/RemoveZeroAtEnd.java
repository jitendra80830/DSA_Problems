package Arrays;

import java.util.Scanner;

public class RemoveZeroAtEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]  = sc.nextInt();
        }
        moveZeroes(arr);
    }

    private static void moveZeroes(int[] nums) {
        if(nums.length ==1 || nums.length == 0){
            return;
        }
        int i = 0;
        int j = 0;
        for (; j < nums.length ;) {
            if(nums[j]==0){
                j++;
            }else {
                swap(nums ,i,j);
                i++;
                j++;
            }
        }
        for (int k = 0; k <nums.length ; k++) {
            System.out.print(nums[k]+" ");
        }
    }

    private static void swap(int nums[] ,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
