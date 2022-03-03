package QueuePack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMaxInWinndow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMaxWin(arr , k);
    }

    private static void findMaxWin(int arr[], int k) {
        if(arr.length == 0 || k <=0 || k > arr.length){
            return;
        }
        Deque<Integer> queue = new LinkedList<>();
       // queue.
        int i;
        for ( i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]){
                queue.removeLast();
            }
            queue.addLast(i);
        }
        for (; i <arr.length ; i++) {
            System.out.print(arr[queue.peek()]+" ");
            while (!queue.isEmpty() && i-k >=queue.peek()){
                queue.removeFirst();
            }
            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]){
                queue.removeLast();
            }
            queue.addLast(i);
        }
        System.out.print(arr[queue.peek()]);



        }


}
