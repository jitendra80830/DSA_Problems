package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class GoogleKick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int p = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        training(arr , n , p);
    }
    public static void training(int arr[] , int n , int p){

        int prefix[] = new int[n+1];
        for (int i =0;i<arr.length;i++){
            prefix[i+1] = prefix[i]  + arr[i];
        }
        Long result = Long.MAX_VALUE;
        for (int i =p-1;i<n;i++){
            long currentSum = prefix[i] - prefix[i-(p-1)];
            long finalHour = arr[i] *(p-1) - currentSum;
            result = Math.min(finalHour , result);
        }
        System.out.println(result);

    }
}
