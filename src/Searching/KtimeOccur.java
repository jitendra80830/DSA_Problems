package Searching;

import java.util.Scanner;

public class KtimeOccur {
    static final int MAX = 100000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        kTimeOccur(arr , k);
    }
    public static void kTimeOccur(int arr[] , int k){
        int n = arr.length;
        int freq[] = new int[MAX+1];
        for(int i =0;i<n;i++){
            if(arr[i] < 1 && arr[i] > MAX){
                System.out.println("-1");
            }
            freq[arr[i]]++;
        }

        for (int i =0;i<MAX;i++){
            if(freq[i] == k){
                System.out.println(i);
                break;
            }

        }

    }
}
