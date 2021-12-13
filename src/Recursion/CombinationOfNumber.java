package Recursion;

import java.util.Scanner;

public class CombinationOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int  k = sc.nextInt();
        combinationOfNumber(arr ,"" , 0 , arr.length , k);
    }

    private static void combinationOfNumber(int[] arr, String ans, int i, int n, int k) {
        if(k==0){
            System.out.println(ans);
    }
        for(int j =i;j<n;j++){
            combinationOfNumber(arr , ans+arr[j]+" " , j+1,n,k-1);
        }


}
}
