package NaggaroCoding;

import java.util.Scanner;

public class SoertZeroOnes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        //sortZeroOne1(arr , n);
        sortZeroOne2(arr , n);
    }

    //tc = O(n2)
    private static void sortZeroOne1(int[] arr , int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                int temp;
                if(arr[j] == 0){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void sortZeroOne2(int arr[] , int n){
        int  j =0;
        for (int i = 0; i <n; i++) {
            if (arr[i] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

}
