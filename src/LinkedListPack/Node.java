package LinkedListPack;

import java.util.ArrayList;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;

    }

}
class LinkedList<C> {
    Node head = null;
    int size = 0;
    public void insertBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;

    }
    public void insertEnd(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }else {
            Node tempNode = head;
            while (tempNode.next != null) {

               tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.next = null;
            size++;
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
        size++;


    }
    public void deleteBeg(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
        size--;

    }
    public void deleteEnd(){
        Node tempNode = head;
        Node prevNode = null;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (tempNode.next!=null){
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        prevNode.next = tempNode.next;
        size--;

    }
    public void deleteMid(int num){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node tempNode = head;
        Node prevNode = null;
        while (tempNode!=null && tempNode.data!=num){
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        prevNode.next = tempNode.next;
        size--;

    }
    public void print(){
        Node tempNode = head;
        while (tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;

        }

    }
    public int size(){
        return this.size;
    }
    public  void addAtIndex(int item ,int k) throws Exception {
        if(k <0 || k >=this.size){
            throw new Exception("Invalid Index");
        }
        else if(k == 0){
            insertBeg(item);
        }
        else if(k == this.size){
            insertEnd(item);
        }else {
            Node newNode  = new Node(6);
            Node prev = getNode(k-1);
            //Node prevNext = prev.next;
            //prev.next = newNode;
            //newNode.next= prevNext;


            newNode.next = prev.next;
            prev.next = newNode;
            this.size++;



        }
    }
    public Node getNode(int k) throws Exception {
        if(k < 0 || k>=this.size){
            throw new Exception("Invalid Index");
        }
        Node tempNode = this.head; //if k == 0 then return temp means head
        for (int i = 0; i <k ; i++) {
            tempNode = tempNode.next;

        }
        return tempNode;

    }
    public int getAtIndex(int k) throws Exception {
        return this.getNode(k).data;

    }
    //public void getMid(int k)
    public static Node reverseInGroup(Node head , int k){
        Node nex = null;
        Node pre = null;
        int count = 0;
        Node curr = head;
        while (curr!=null && count < k){
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
            count++;
        }
        if(nex!=null){
            head.next = reverseInGroup(nex , k);
        }
        return pre;

    }
    public Node reverseLikedList(Node head){
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        while (curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }


}
