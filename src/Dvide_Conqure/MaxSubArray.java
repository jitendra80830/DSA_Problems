package Dvide_Conqure;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        //maxSubArray(arr);
        System.out.println(maxSubArray2(arr , 0 ,n-1));
    }

    //tc =  o(n2)
    private static void maxSubArray(int[] arr) {

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            for (int j = i; j <arr.length ;j++) {
                sum+= arr[j];
                if(maxsum < sum){
                    maxsum = sum;
                }

            }
        }
        System.out.println(maxsum);
    }
    //optimize using devide ans conquer -nlogn
    public static int maxSubArray2(int arr[] , int low , int high){
        if(low == high){
            return arr[low];
        }
        int leftmax = Integer.MIN_VALUE;
        int sum = 0;
        int mid = (low+high)/2;
        for (int i = mid; i>low - 1; i--) {
            sum+=arr[i];
            if(leftmax < sum){
                leftmax = sum;
            }
        }
        int rightmax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid+1; i <high+1 ; i++) {
            sum+= arr[i];
            if(rightmax < sum){
                rightmax = sum;
            }
        }
        int maxleftArr = maxSubArray2(arr , low , mid);
        int maxrightArr = maxSubArray2(arr , mid+1 , high);
        return Math.max(leftmax+rightmax , Math.max(maxleftArr , maxrightArr));
    }

}
