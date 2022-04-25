package Greedy;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        long minOdd = Integer.MAX_VALUE;
        long sum = 0;
        for(int i =0;i<n;i++){
            if(arr[i] >0){
                sum+=arr[i];
            }
            if(arr[i] %2!=0){
                if(minOdd > Math.abs(arr[i])){
                    minOdd = Math.abs(arr[i]);
                }
            }
        }
        //System.out.println(sum);
        if(sum % 2 !=0){
            System.out.println(sum);
        }else {
            System.out.println(sum-minOdd);
        }

    }
}
