package QueuePack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Max_Min_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumMinMaxEle(arr , k));

    }

    private static long sumMinMaxEle(int[] arr, int k) {
        long sum = 0;
        Deque<Integer> s = new LinkedList<>();
        Deque<Integer> g = new LinkedList<>();
        int i = 0;
        for (i = 0; i <k ; i++) {

            while (!s.isEmpty() && arr[s.peekLast()] >= arr[i]){
                s.removeLast();
            }
            while (!g.isEmpty() && arr[g.peekLast()] <= arr[i]){
                g.removeLast();
            }
            g.addLast(i);
            s.addLast(i);
        }
        for ( ; i < arr.length ; i++) {
            sum+=arr[s.peekFirst()] + arr[g.peekFirst()];

            // Remove all elements which are out of this window
            while (!s.isEmpty() && s.peekFirst() <= i-k){
                s.removeFirst();
            }
            while (!g.isEmpty() && g.peekFirst() <= i-k){
                g.removeFirst();
            }


            // remove all previous greater element that are useless
            while (!s.isEmpty() && arr[s.peekLast()] >= arr[i]){
                s.removeLast();
            }

            // remove all previous smaller that are element are useless

            while (!g.isEmpty() && arr[g.peekLast()] <= arr[i]){
                g.removeLast();
            }
            // Add current element at rear of both deque
            g.addLast(i);
            s.addLast(i);

        }
        sum+=arr[s.peekFirst()] + arr[g.peekFirst()];
        return sum;
    }
}
