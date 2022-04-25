package Greedy;

import java.util.Scanner;

public class PowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[String.valueOf(n).length()+2];
        int number = n;
        int index = 0;
        while (number>0){
            arr[index] = number % 3;
            number = number/3;
            index++;
        }
        int  idx = 0;
        for (int i = 0; i <arr.length-1 ; ++i) {
            if(arr[i] >=2 ){
                arr[0] = 0;
                arr[i+1]++;

                for (int j = idx; j <i ; ++j) {
                    arr[j] = 0;
                }
                idx = i+1;
            }
            if(arr[i] == 3){
                arr[i] = 0;
                arr[i+1]++;
            }
        }
        int j = arr.length-1;

        if(arr[j]>=2){
            arr[index] = 1;
            index++;
        }
        int ans = 0;
        for (int i = arr.length-1; i >=0 ; --i) {
            ans = ans * 3 + arr[i];

        }
        System.out.println(ans);
    }
    public static int pow(int a,int b){
        if(b == 0){
            return 1;
        }

        return a*pow(a,b-1);
    }
}
