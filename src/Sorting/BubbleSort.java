package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int arr[]){
        int len = arr.length;
        for (int pass =1;pass<=len-1;pass++){
            for (int j = 0;j<len-pass;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
