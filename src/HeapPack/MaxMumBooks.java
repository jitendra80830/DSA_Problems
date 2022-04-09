package HeapPack;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxMumBooks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            mh.add(arr[i]);
        }
        int counter = 0;
        for (int i = 0; i <mh.size() ; i++) {
            int minValue = mh.peek();
            if(k >= minValue){
                k-=minValue;
                counter++;
                mh.remove();
            }

        }
        System.out.println(counter);
    }
}
