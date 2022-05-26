package Dvide_Conqure;

import java.util.Scanner;

public class Findmedian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            arr2[i] = sc.nextInt();
        }
        int mergArr[] = mergeTwoSortedArray(arr1 , arr2);
        int i =0;
        int j = mergArr.length-1;
        int mid = (i+j)/2;
        int median;
        if(mergArr.length % 2 !=0){
            median = mergArr[mid];
        }else {
            median = (mergArr[mid] + mergArr[mid+1])/2;
        }
        System.out.println(median);

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
