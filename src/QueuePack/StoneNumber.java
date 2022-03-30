package QueuePack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StoneNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            q.add(i);
        }
//        int rem = q.remove();
//        System.out.println(rem);
//        System.out.println(q);
//        q.add(rem);
//        System.out.println(q);
        while (q.size()!=1){
            int removeEle = q.remove();
            q.add(removeEle);
            q.remove();
        }
        System.out.println(q.remove());
    }
}
