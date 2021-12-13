package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(partition(arr ,0 , arr.length-1));
        quickSort(arr ,0 ,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void quickSort(int arr[] , int si , int ei){
        if(si > ei){
            return;
        }
        int pi = partition(arr , si , ei); //  pi index
        quickSort(arr , si , pi-1);
        quickSort(arr , pi+1 , ei);


    }
    public static int partition(int arr[] , int si , int ei){ // for finding correct index of pivot element
        int pi = si;
        int pivot = arr[ei];

        for (int i = si; i < ei; i++) {
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }

        }
        int temp = arr[pi];
        arr[pi] = arr[ei];
        arr[ei] = temp;
        return pi;

    }
}
