package Tries;

import java.util.Scanner;

public class XorMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] ^ arr[j];
                    if (max < sum) {
                        max = sum;
                    }
                }

            }
            System.out.println(max);
        }
    }
}
