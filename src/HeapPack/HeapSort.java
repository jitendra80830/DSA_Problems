package HeapPack;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            MinHeap minHeap = new MinHeap(n);
            for (int i = 0; i <n ; i++) {
                minHeap.insert(arr[i]);
            }
            minHeap.heapSort(arr);
            minHeap.print();
        }

    }



}
