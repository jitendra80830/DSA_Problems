package QueuePack;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.display();
        q.deQueue();
        q.display();
        System.out.println(q.getFront());
    }
}
