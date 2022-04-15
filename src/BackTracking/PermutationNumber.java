package BackTracking;

import java.util.Scanner;

public class PermutationNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =3;// sc.nextInt();
        int arr[] = {1,2,3};
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
        permutaionNumber(arr , 0);
    }

    private static void permutaionNumber(int[] arr, int i) {
        if(i == arr.length){
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }else {
            for (int j = i; j < arr.length ; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                permutaionNumber(arr, i + 1);

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


            }
        }

    }
}
