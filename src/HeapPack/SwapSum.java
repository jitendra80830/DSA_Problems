package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SwapSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                long sum = 0;
                PriorityQueue<Integer> minheap = new PriorityQueue<>(); //PQ1
                PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());//PQ2

                for (int k = 0; k <n; k++) {
                    if (k >= i && k <= j) {
                        maxheap.add(arr[k]);
                        sum += arr[k];
                    } else {
                        minheap.add(arr[k]);
                    }
                }

                res = Math.max(res, sum);

                for (int k = 1; k <= s; k++) {
                    if ( !minheap.isEmpty() && !maxheap.isEmpty() &&  maxheap.peek() < minheap.peek()) {
                        sum -= maxheap.peek();
                        maxheap.remove();
                        sum += minheap.peek();
                        minheap.remove();

                        res = Math.max(res, sum);
                    }else {
                        break;
                    }

                }
            }
        }

        System.out.println(res);
    }
}
