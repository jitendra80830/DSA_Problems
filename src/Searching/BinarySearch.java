package Searching;

import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++){
          arr[i] = sc.nextInt();

      }
      int item = sc.nextInt();
      //System.out.println(binarySearch(arr ,item));
      System.out.println(binarySearchRecursive(arr , item ,0 , arr.length-1));
  }
  public static int binarySearch(int arr[] , int item){
      int low = 0;
      int high = arr.length-1;
      while (low<=high) {
          int mid = low + (high - low) / 2;
          if(arr[mid] == item){
              return mid;
          }
          if(arr[mid] > item){
              high = mid -1;
          }else {
              low = mid+1;
          }
      }
      return -1;



  }
  public static int binarySearchRecursive(int arr[] , int item , int low , int high){
     if(low > high){
         return -1;
     }
     int mid = low+(high-low)/2;
     if (arr[mid] == item){
         return mid;
     }
     if(arr[mid] > item){
         return binarySearchRecursive(arr , item , low , mid-1);
     }else {
         return binarySearchRecursive(arr ,item , mid+1 , high);
     }
  }

}
