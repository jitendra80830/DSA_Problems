package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Pythogorean_Triplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(pythogoreanTriplet(arr , n)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean pythogoreanTriplet(int[] arr , int n) {
        for (int i = 0; i <n ; i++) {
            arr[i] = arr[i] * arr[i];
        }
        for (int i = n-1; i >=2 ; i--) {
            int  j =0;
            int k = i-1;
            while (j<k){
                if(arr[i] == arr[j]+arr[k]){
                    return true;
                }else if(arr[i] > arr[j]+arr[k]){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return false;

    }
}
