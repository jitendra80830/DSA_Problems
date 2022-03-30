package NaggaroCoding;

import java.util.Scanner;

public class ThreeArrayCommmonEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arr3[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            arr3[i] = sc.nextInt();
        }
        //commonElements(arr1 , arr2 , arr3 , n);
        commonElements2(arr1 , arr2 , arr3 , n);
    }

    private static void commonElements(int[] arr1, int[] arr2, int[] arr3, int n) {
        int flag = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                if (arr1[i] == arr2[j]){
                    for (int k = 0; k <n ; k++) {
                        if (arr1[i] == arr3[k]){
                            System.out.print(arr1[i]+" ");
                            flag = 1;
                            break;
                        }

                    }
                }

            }

        }
        if(flag == 0){
            System.out.print("No Common Elements");
        }
    }
    public static void commonElements2(int arr1[] , int arr2[] , int[] arr3 , int n){
        int i = 0;
        int j = 0;
        int k = 0;
        int flag = 0;
        while (i < n && j < n && k < n){
            if(arr1[i] == arr2[j] && arr1[i] == arr3[k]){
                flag = 1;
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                k++;
            }else {
                if(arr1[i] > arr2[j] && arr1[i] == arr3[k]){
                    j++;
                }
                if(arr2[j] > arr1[i] && arr2[j] == arr3[k]){
                    i++;
                }
                if(arr1[i] > arr3[k] && arr1[i] == arr2[j]){
                    k++;
                }
                if(arr1[i] > arr2[j] && arr1[i] > arr3[k]){
                    j++;
                    k++;
                }
                if(arr2[j] > arr1[i] && arr2[j] > arr3[k]){
                    i++;
                    k++;
                }
                if(arr3[k] > arr1[i] && arr3[k] > arr2[j]){
                    i++;
                    j++;
                }
            }
        }
        if(flag == 0){
            System.out.print("No Common elements");
        }
    }
}
