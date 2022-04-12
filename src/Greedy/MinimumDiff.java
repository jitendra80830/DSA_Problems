package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDiff {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int diff = 0;
        for (int i = 0; i <n ; i++) {
            diff += Math.abs(arr1[i] - arr2[i]);

        }
        System.out.println(diff);
    }
}

