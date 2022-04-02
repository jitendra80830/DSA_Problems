package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MedianAgain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        median(arr,k,n);
        //mediamnAgain(arr , k);
    }
    public static void median(int arr[] , int k , int n) {
        int mid = n/2;
        int i ;
        for (i = arr[mid]; k > 0; i++) {
            while (i == arr[mid+1]) {
                mid++;
            }
                k -= (mid- n/2 +1);


        }
        if(k==0){
            System.out.println(i);
        }else{
            System.out.println(i-1);
        }

    }

    private static void mediamnAgain(int[] arr, int k) {
        int i =0;
        int  low = 0;
        int high = arr.length-1;
        while (i<=k){
            int mid = (low+high)/2;
            if(arr[mid] < arr[mid+1]) {
                int diff = arr[mid + 1] - arr[mid];
                k -= diff;
                arr[mid] = arr[mid] + diff;
                i++;
            }
            if ((arr[mid] == arr[mid+1])){
                if (i <= k) {
                    arr[mid + 1] = arr[mid + 1] + 1;
                    arr[mid] = arr[mid] + 1;
                    i++;
                    k-=2;
                }
            }
            System.out.println(arr[mid]);


        }
    }
}
