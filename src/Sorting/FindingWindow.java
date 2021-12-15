package Sorting;

import java.util.Scanner;

public class FindingWindow {
    public static void main(String [] arg){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        findWindow(arr);
    }
    public static void findWindow(int arr[]){
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                start = i;
                break;
            }
        }
        int end = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i] < arr[i-1]){
                end = i;
                break;
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <=end; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i < start; i++) {
            if(arr[i] > min){
                start = i;
            }
        }
        for (int i = end; i < arr.length; i++) {
            if(arr[i]  <  max){
                end = i;
            }
        }
        System.out.println(start+","+end);
    }

}
