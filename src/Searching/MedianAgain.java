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
        median(arr ,n , k);
    }

    //wrong
    public static void median(int arr[] , int k , int n) {
        int mid = n/2;
        int i;
        for (i = arr[mid]; k > 0; i++) {
            while (mid+1<n && i == arr[mid+1]) {
                mid++;
            }

            k -= (mid- n/2 +1);


        }
        if(k==0){
            System.out.println(i);
        }else{
            System.out.println(i-1);
        }

    }
}
