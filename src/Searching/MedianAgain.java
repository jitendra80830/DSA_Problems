package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class MedianAgain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        medianAgain(arr ,n , k);
    }

    //wrong
    private static void medianAgain(int[] arr, int n, int k) {
        int low = 0;
        int high = arr.length-1;
        int i = 0;
        int median = 0;
        while (low < high && i <= k){
            int mid = (low + high)/2;
            median = arr[mid];
            if(median < arr[mid+1]){
                low = mid+1;
            }
            i++;
        }
        System.out.println(median);
    }
}
