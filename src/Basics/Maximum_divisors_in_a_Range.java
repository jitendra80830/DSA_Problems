package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_divisors_in_a_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdfind = gcd(a, b);
        //int arr[] = factor(gcdfind);
        int arrIndex = 0;
        int i = 1;
        int arr[] = new int[9999999];
        while (i <= gcdfind) {
            if (gcdfind % i == 0) {

                arr[arrIndex++] = i;
                //arrIndex = arrIndex + 1;

            }
            i++;
        }
        //Arrays.sort(arr);

        int t = sc.nextInt();
        while (t-->0){
            int low = sc.nextInt();
            int high = sc.nextInt();
            int id1 = lowerBound(arr,0,arrIndex-1, low);
            int id2 = upperBound(arr,0,arrIndex-1, high);
            if(arrIndex == 0 || low > arr[id1]){
                id1++;
            }
            int diff = id2 - id1;
            if(diff == 0) {
                System.out.println("-1");
            }else {
                System.out.println(arr[id2 - 1]);
            }

        }
    }

    private static int lowerBound(int[] arr, int start, int end, int key) {
        if (start > end)
            return end;
        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return lowerBound(arr, start, mid-1, key);
        else
            return lowerBound(arr, mid+1, end, key);
    }


    private static int upperBound(int[] arr, int start, int end, int key) {
        if (start > end)
            return start;
        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return upperBound(arr, mid+1, end, key);
        else if (arr[mid] > key)
            return upperBound(arr, start, mid-1, key);
        else
            return upperBound(arr, mid+1, end, key);
    }


    static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(b%a==0)
                return a;
            int temp = a;
            a = b%a;
            b = temp;
        }
        return a;
    }

}
