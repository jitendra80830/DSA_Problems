package Sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int arr[]){
        int len = arr.length;
        for (int counter = 0;counter<len-1;counter++){
            int min = counter;
            for(int i = counter+1;i<len;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            int temp = arr[counter];
            arr[counter] = arr[min];
            arr[min] = temp;
        }
    }
}
