package Searching;

import java.util.Scanner;

public class FirstOccurenceOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstOneOccur2(arr , 0 , arr.length-1));

    }
    //using linear search O(n)
    public static int firstOneOccur(int arr[]){
        int len   = arr.length;
        int flag = 0;
        for (int i = 0;i<len;i++){
            if(arr[i] == 1){
                flag = 1;
                return i;

            }
            if(flag == 1){
                break;
            }

        }
        return -1;
    }
    //using binary search O(logn)
    public static int firstOneOccur2(int arr[] , int low , int high){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)){
            return mid;
        }
        if(arr[mid] == 0){
            return firstOneOccur2(arr , mid+1 , high);
        }else {
            return firstOneOccur2(arr, low, mid-1);
        }

    }
}
