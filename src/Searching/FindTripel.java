package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FindTripel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        pythogoreanTriplet(arr ,n);
    }
    private static void pythogoreanTriplet(int[] arr , int n) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int flag = 0;
        for (int i = n-1; i >=2 ; i--) { //i = n1
            int  j =0; //n2
            int k = i-1; //n3

            while (j<k){
                if(arr[i] == arr[j]+arr[k]){
                    flag = 1;
                    if(arr[k] > arr[j]){
                        if(n1 < arr[i]){
                            n1 = arr[i];
                        }
                        if(n3 < arr[k]){
                            n3 = arr[k];
                        }
                        n2 = arr[j];


                        //break;
                    }
                    j++;
                    k--;
                }else if(arr[i] > arr[j]+arr[k]){
                    j++;
                }else {
                    k--;
                }
            }
        }
        if(flag ==1) {
            System.out.print(n1 + " ");
            System.out.print(n2 + " ");
            System.out.println(n3);
        }else {
            System.out.println("-1");
        }

    }
}
