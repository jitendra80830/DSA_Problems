package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FascintingMulpleNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                maxHeap.add(arr[i]);
            }
            while (maxHeap.size() != 1) {
                int p = maxHeap.peek();
                maxHeap.remove();
                int q = maxHeap.peek();
                maxHeap.remove();
                int insertEle = ((p * 3) - (q * 2));
                maxHeap.add(insertEle);
            }
            System.out.println(maxHeap.peek());
        }
    }
}
