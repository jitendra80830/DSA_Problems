package Arrays;

import java.util.Scanner;

public class StockMarkate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            stockMarket(arr);

        }
    }

    private static void stockMarket(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] < arr[i+1]){
                sum+= arr[i+1] - arr[i];
            }

        }
        System.out.println(sum);
    }
}
