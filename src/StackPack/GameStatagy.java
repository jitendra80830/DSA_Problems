package StackPack;

import java.util.Scanner;
import java.util.Vector;

public class GameStatagy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0; //X
        int top = n - 1;//Y
        Vector<Integer> result = new Vector<>();
        while (start != n && top != -1) {
            if (arr[start] > arr[top]) {
                result.add(1);
                top--;
            } else if (arr[top] > arr[start]) {
                result.add(2);
                start++;
            } else if (arr[start] == arr[top]) {
                result.add(0);
                start++;
                top--;
            }

        }
        for (int i = 0; i <result.size() ; i++) {
            System.out.print(result.get(i)+" ");

        }
        //System.out.println(result);
    }
}