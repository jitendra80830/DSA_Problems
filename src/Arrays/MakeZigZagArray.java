package Arrays;

import java.util.Scanner;

public class MakeZigZagArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
       System.out.println(makeZigZag1(arr1));
    }
    public static int makeZigZag1(int arr1[]){
        int len = arr1.length;
        int even = 0;
        int odd = 0;
        int arr2[] = new int[len];
        for(int i =0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        for(int i =0;i<len;i++){
            if(i+1 < len){
                if(i %2 == 0){
                    if(arr1[i] <= arr1[i+1]){
                        int diff = arr1[i+1] - arr1[i];
                        even+=diff+1;
                        arr1[i+1] = arr1[i+1] - (diff+1);
                    }
                }else {
                    if(arr1[i] >= arr1[i+1]){
                        int diff = arr1[i] -arr1[i+1];
                        even+= (diff+1);
                        arr1[i] = arr1[i] - (diff+1);
                    }
                }
            }
        }
        for(int i =0;i<len;i++){
            if(i+1 < len){
                if(i%2 == 0){
                    if(arr2[i] >= arr2[i+1]){
                        int diff = arr2[i] - arr2[i+1];
                        odd+= diff+1;
                        arr2[i] = arr2[i] - (diff+1);
                    }
                }else {
                    if(arr2[i] <=arr2[i+1]){
                        int diff = arr2[i+1] - arr2[i];
                        odd+= diff+1;
                        arr2[i+1] = arr2[i+1] - (diff+1);
                    }
                }

            }
        }
        return Math.min(even , odd);
    }
}
