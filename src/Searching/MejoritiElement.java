package Searching;

import java.util.Scanner;

public class MejoritiElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //findMejority(arr);
        System.out.println(mejority(arr));
    }
    public static void findMejority(int arr[]){
        int n = arr.length;
        int ansIndex = mejority(arr);
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i] == ansIndex){
                count++;
            }
        }
        if(count > n/2){
            System.out.println(ansIndex);
        }else{
            System.out.println("-1");
        }
    }
    public static int mejority(int arr[]){
        int n = arr.length;
        int index = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[index]){
                count++;
            }else {
                count--;
            }
            if(count ==0){
                index = i;
                count = 1;
            }
        }
        return arr[index];

    }
}
