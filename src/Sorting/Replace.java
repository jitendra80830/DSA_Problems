package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = arr[i];

        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(ans[i]!=arr[i]){
                count++;
            }
        }
        System.out.println(count);


    }
}
