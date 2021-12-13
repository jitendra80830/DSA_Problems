package Stringpck;

import java.util.*;
import java.io.*;
public class Main {
    static int floor_number(int arr[], int low, int high, int x){
        if(low <= high){
            int mid = (low + high)/2;
            //If x matches a element in the array, return its index
            if(arr[mid] == x)
                return mid;
                //if x > mid value of array, search in the right half
            else if(arr[mid] < x)
                return floor_number(arr, mid+1, high, x);
                //if x < mid value of array, search in the left half
            else
                return floor_number(arr, low, mid-1, x);
        }
        //If no value matches x , return high
        return high;
    }
    public static int floor2(int arr[] , int low , int high ,int x){
        int rec = -1;
        while (low<=high){
            int mid = low + (high - low)/2;

            if (x > arr[high]){
                rec = high;
                break;
            }
            if(arr[mid] == x){
                rec = mid;
                break;
            }
            if(arr[mid] > x){
                high = mid-1;
            }
            else if(arr[mid] < x){
                rec = mid;
                low = mid+1;
            }
        }
        return rec;
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            int low = 0;
            int high = n-1;
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            System.out.println(floor2(arr, 0, arr.length - 1, x));

            //If x is smaller than the first element print -1
//            if(x < arr[0])
//                System.out.println("-1");
//      /* If x is greater than the last element,
//        its floor value will be the last element */
//            else if(x > arr[n-1])
//                System.out.println(n-1);
//            else
//                //Floor value is present in the array, check for it
//                System.out.println(floor_number(arr, low, high, x));
        }
    }
}