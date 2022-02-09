package StackPack;

//import java.util.Scanner;

public class StockSpanProblem {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,5,10,20,50};
        stockSpan(arr);
    }

    private static void stockSpan(int[] arr) {
        int span[] = new int[arr.length];
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            span[i] = 1;
            for (int j = i-1; j >=0; j--) {
                if(arr[j] < arr[i]){
                    span[i]++;
                }else {
                    break;
                }
            }

        }
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");

        }
    }
}
