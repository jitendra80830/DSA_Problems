package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxProductTwoVal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(productOfTwoVal(arr));
    }

    private static int productOfTwoVal(int[] arr) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
        }
        int max1 = max.poll();
        int max2 = max.poll();

        int product = (max1-1) * (max2-1);
        return product;
    }
}
