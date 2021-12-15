package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arrangeDigit(n);
    }
    public static void arrangeDigit(int n){
        int num = n;
        int count = 0;

        while (num!=0){
            count++;
            num= num/10;
        }

        int arr[] = new int[count];

        for (int i = 0; i <count; i++) {
            int digit = n%10;
            arr[i] = digit;
            n = n/10;

        }
        Arrays.sort(arr);
        int flag = 0;
        for (int j = 0; j <count-1 ; j++) {
            if(arr[j+1] != arr[j] +1){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }

    }
}
