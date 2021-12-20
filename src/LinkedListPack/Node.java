package LinkedListPack;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
class LinkedList{
    Node head = null;
    public void insertBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertEnd(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else {
            Node tempNode = head;
            while (tempNode.next != null) {

               tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.next = null;
        }
    }
    public void insertMid(int data , int num){
        Node newNode = new Node(data);
        Node tempNode = head;
        while (tempNode!=null && tempNode.data!=num){
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;


    }
    public void deleteBeg(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;

    }
    public void deleteEnd(){
        Node tempNode = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (tempNode.next!=null){
            tempNode = tempNode.next;
        }

    }
    public void deleteMid(int num){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node tempNode = head;
        while (tempNode!=null && tempNode.data!=num){
            tempNode = tempNode.next;
        }

    }
    public void print(){
        Node tempNode = head;
        while (tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;

        }

    }

}
