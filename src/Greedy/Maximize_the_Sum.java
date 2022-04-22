package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Maximize_the_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int prefixArr[] = new int[n];
        for (int i = 1; i <n ; i++) {
            prefixArr[0] = arr[0];
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }


        int sum = 0;
        for (int i = 0; i <n ; i++) {

            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
