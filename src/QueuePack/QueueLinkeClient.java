package QueuePack;

import java.util.Scanner;

public class QueueLinkeClient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int item = sc.nextInt();
            q.enqueue(item);
        }
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
