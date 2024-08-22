package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int k  = sc.nextInt();
        rotate(arr , k);
    }

    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i <k ; i++) {
            int lastEle = nums[n-1];
            for (int j = n-2; j >=0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = lastEle;

        }
        for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void reverse_Algo(int arr[],int k){
        k = k%arr.length;
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
    }
}
