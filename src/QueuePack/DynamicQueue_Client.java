package QueuePack;

public class DynamicQueue_Client {
    public static void main(String[] args) throws Exception {
        DynamicQueue dd = new DynamicQueue();
        dd.enQueue(10);
        dd.enQueue(20);
        dd.enQueue(30);
        dd.enQueue(40);
        dd.enQueue(50);
        dd.enQueue(60);
        dd.enQueue(70);
        dd.display();
        dd.deQueue();
        dd.display();
        dd.enQueue(90);
        dd.display();
    }
}
