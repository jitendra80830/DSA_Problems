package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Maximize_the_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

//        int prefixArr[] = new int[n];
//        for (int i = 1; i < n; i++) {
//            prefixArr[0] = arr[0];
//            prefixArr[i] = prefixArr[i - 1] + arr[i];
//        }

        long m =0;
        long maxsum = -1;
        for (int i = 0; i < n; i++) {
            //int x = arr[i];

            long sum = arr[i]*(n-i)- m ;//(prefixArr[i]);
            maxsum = Math.max(maxsum , sum);
            m+=arr[i];
        }
        System.out.println(maxsum);
    }
}






