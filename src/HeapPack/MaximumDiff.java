package HeapPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumDiff {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        MinHeap minHeap = new MinHeap(n);
        for (int i = 0; i <n ; i++) {
            minHeap.insert(arr[i]);
        }
        minHeap.heapSort(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>(q);
        int i =0;
        while (!pq.isEmpty() && i<n-1){
            pq.add(arr[i]);


        }





    }
}
