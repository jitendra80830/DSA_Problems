package StackPack;


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class StackUsingLikedList {
    Node head = null;
    int size = 0;

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
        }else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    public int pop(){
        if(head == null){
            return -1;
        }
        int data  = head.data;
        head = head.next;
        size--;
        return data;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(head == null){
            return -1;
        }
        int data = head.data;
        return data;
    }
    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


}
