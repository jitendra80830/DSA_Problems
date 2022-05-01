package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialPairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int counter = 0;
        for (int i = arr.length-1; i >=1 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                int val = k * arr[j];
                if(arr[i] > val){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
