package Dvide_Conqure;

import java.util.Arrays;
import java.util.Scanner;

public class StickBundle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        stickBundle(1 , max);
    }

    private static void stickBundle(int i, int max) {

    }
}
