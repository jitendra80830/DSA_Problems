package DoublyLinkedList;

public class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedlist{
    Node head = null;
    public void insertBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    public void insertEnd(int data){
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode.next!=null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.prev = tempNode;
        newNode.next = null;
    }
    public void insertMid(int data , int num){
        Node newNode = new Node(data);
        Node tempNode  = head;
        if(head == null){
            head = newNode;
            return;
        }
        while (tempNode!=null && tempNode.data!=num){
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        newNode.next.prev = newNode;
        tempNode.next = newNode;
        newNode.prev = tempNode;
    }
    public void print(){
        Node tempNode = head;
        while (tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;

        }

    }

}
