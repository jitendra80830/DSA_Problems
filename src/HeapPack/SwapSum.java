package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SwapSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int curans = 0;
                PriorityQueue<Integer> minheap = new PriorityQueue<>();
                PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        curans += a[k];
                        minheap.add(a[k]);
                    } else {
                        maxheap.add(a[k]);
                    }
                }
                ans = Math.max(ans, curans);
                for (int k = 1; k <= s; k++) {
                    if (maxheap.isEmpty() || minheap.isEmpty() || minheap.peek() >= maxheap.peek()) {
                        break;
                    }
                    curans -= minheap.peek();
                    minheap.remove();
                    curans += maxheap.peek();
                    maxheap.remove();
                    ans = Math.max(ans, curans);
                }
            }
        }
        System.out.println(ans);
    }
}

