package Searching;

import java.util.*;
import java.io.*;

public class MissAP{
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            findMissAp(arr);
        }

    }
    public static void findMissAp(int arr[]){
        int low=0;
        int high=arr.length-1;
        int mid=low+(high-low)/2;
        int cd=0;
        if((arr[mid]-arr[mid-1])==(arr[mid+1]-arr[mid])) {
            cd = arr[mid] - arr[mid - 1];
        }else {
            cd = Math.abs((arr[mid] - arr[mid - 1]) - (arr[mid + 1] - arr[mid]));
        }
        for (int i= 0; i < arr.length-1 ; i++){
            if(arr[i]+cd==arr[i+1]) {
                continue;
            }
            else{
                System.out.println(arr[i]+cd);
                break;
            }
        }
    }

}
