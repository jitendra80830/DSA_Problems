package Sorting;


import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void insertionSort(int arr[]){
        int len = arr.length;
        for(int counter = 1;counter<len;counter++){
            int item = arr[counter]; // item which will search correct position in left side
            int j = counter -1; // j start from counter-1 till 0
            while (j>=0 && arr[j] >item){ //jab left ka item big hoga item se tb hi loop chalega
                arr[j+1] = arr[j]; // left ka element right me chala jayege
                j--;
            }
            arr[j+1] = item; //  in the last j+1 pe item ki insert kr denge
        }
    }

}
