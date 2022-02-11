package QueuePack;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedList {
    Node front = null;
    Node rear = null;
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front=rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }
    public int dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;

    }

}
