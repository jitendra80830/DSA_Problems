package Recursion;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0; // for 0
        binaryPrint(n , 1 , arr);
        arr[0] =1; //for 1 call
        binaryPrint(n , 1 ,arr);
    }
    public static void binaryPrint(int n , int i , int arr[]){
        if(i==n){
            for(int j =0;j<n;j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            return;

        }

        if(arr[i-1] !=1){//if i-1 == 0
            arr[i] = 0;
            binaryPrint(n , i+1 ,arr);
            arr[i] = 1;
            binaryPrint(n , i+1 , arr);
        }else{ //i-1 == 1
            arr[i] = 0;
            binaryPrint(n , i+1 , arr);
        }
    }
}
