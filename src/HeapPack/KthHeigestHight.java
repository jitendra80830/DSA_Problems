package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthHeigestHight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //maxHeap
        for (int i = 0; i <n ; i++) {
            maxHeap.add(arr[i]);
        }
        int counter = 0;
        for (int i = 0; i <n ; i++) {
            int maxEle = maxHeap.peek();
            maxHeap.remove();
            counter++;
            if(counter == k){
                System.out.println(maxEle);
            }
            
        }
    }
}
