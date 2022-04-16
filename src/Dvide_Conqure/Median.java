package Dvide_Conqure;

import java.util.Scanner;

public class Median {
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
        int ans[] = mergeTwoSortedArray(arr1 ,arr2);
//        for (int i = 0; i <ans.length ; i++) {
//            System.out.print(ans[i]+" ");
//        }
        System.out.println();
        median(ans);
    }

    private static void median(int[] ans) {
        int low =0;
        int high  = ans.length;
        while (low <=high){
            int mid = (low + high)/2;
            if(ans.length %2!=0){
                System.out.println(ans[mid]);
                break;
            }else {
                System.out.println((ans[mid-1]+ans[mid])/2);
                break;
            }
        }

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
