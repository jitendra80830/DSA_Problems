package NaggaroCoding;

import java.util.Scanner;
import java.util.*;


public class ArrrangeAbsuteValues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        arrangeAbsluteArray(arr);
    }

    private static void arrangeAbsluteArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (j!=i){
            if(Math.abs(arr[i]) > Math.abs(arr[i+1])){
                if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                    swap(i, j, arr);
                    j--;
                }else {
                    j--;
                }
            }else {
                swap(i ,i+1 ,arr);
                if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                    swap(i, j, arr);
                    j--;
                }

            }
        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]+" ");

        }

    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
