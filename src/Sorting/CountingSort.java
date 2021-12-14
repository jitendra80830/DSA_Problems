package Sorting;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max ,arr[i]);
            min = Math.min(min , arr[i]);

        }
        countingSort(arr ,min , max);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void countingSort(int[] arr, int min, int max) {
        int range = max-min + 1;
        int freque[] = new int[range];
        for(int i =0;i<arr.length;i++){ // frequency array
            int idx= arr[i] - min;
            freque[idx]++;
        }
        for (int i = 1; i <freque.length ; i++) { // prefix sum
            freque[i] = freque[i] + freque[i -1];

        }
        int ans[] = new int[arr.length];
        for(int i = arr.length-1 ; i>=0;i--){
            int val = arr[i]; // value of original array
            int position = freque[val - min]; //  position of array's element at freque index
            int idx = position - 1; // minus 1 for exact index like 15 -1 =14
            ans[idx]  = val; // we are staying element in ans's array
            freque[val - min]--; //for like 14 after 13 ,12,11 so on
        }
        for(int i =0;i<ans.length;i++){
            arr[i] = ans[i];
        }
    }
}
