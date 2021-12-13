package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }


    }
    public static int[] mergeSort(int arr[] , int start , int end){

        if(start == end){
            int [] bc = new int[1];
            bc[0] = arr[start];
            return bc;


        }

        int mid = (end+start)/2;
        int fs[]  = mergeSort(arr , 0 ,mid); // first sort arr
        int ss[]  = mergeSort(arr , mid+1 ,end);//second sort array
        return mergeTwoSortedArray(fs , ss);

    }
    public static int[] mergeTwoSortedArray(int arr1[] , int arr2[]){
        int i =0; // for arr1
        int j =0; // for arr2
        int c[] = new int[arr1.length+arr2.length];
        int k = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                c[k] = arr1[i];
                i++;
                k++;
            }else {
                c[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i<arr1.length){ // for remaining arr1 elements
            c[k] = arr1[i];
            i++;
            k++;

        }
        while (j<arr2.length){ // for remaining arr2 elements
            c[k] = arr2[j];
            j++;
            k++;
        }
        return c;
    }
}
