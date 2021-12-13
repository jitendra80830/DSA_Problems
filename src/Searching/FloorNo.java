package Searching;

import java.util.Scanner;

public class FloorNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (x < arr[0]) {
                System.out.println("-1");
            } else if (x > arr[n - 1]) {
                System.out.println(n-1);
            } else {
                System.out.println(floorNo(arr, 0, arr.length - 1, x, arr.length));
            }
        }
    }

    public static int floorNo(int arr[], int low, int high, int x, int n) {

        if (low > high) {
            return 0;
        }

            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                return mid;
            }
            if (arr[mid] > x) {
                return floorNo(arr, low, mid - 1, x, n);
            } else {
                return floorNo(arr, mid + 1, high, x, n);
            }
        }
    }

