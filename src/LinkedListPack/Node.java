package LinkedListPack;

import java.util.ArrayList;
import java.util.HashSet;

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
    public int maxPalindromeLen(){
        return maxPalindrome(this.head);
    }
    private  int maxPalindrome(Node head){
        int result = 0;
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;

            // check for odd length
            result = Math.max(result ,
                    2 * countCommon(prev , next) +1);

            // check for even length
            result = Math.max(result ,
                    2 * countCommon(curr , next));

            prev = curr;
            curr = next;

        }
        return result;
    }

    private  int countCommon(Node prev, Node next) {
        int count = 0;
        for(;prev!=null && next!=null;prev = prev.next,next = next.next){

            if(prev.data == next.data){
                count++;
            }else {
                break;
            }
        }

        return count;
    }
    public Node reverseBtRange(int l ,int r){
        return reverseBetweenRange(head ,l ,r);

    }
    public Node reverseBetweenRange(Node head , int m ,int n){
        if(m == n){
            return head;
        }
        Node rev_start = null; //starting of to be reversed(mth)
        Node rev_end = null; //ending of to be reversed(nth)
        Node revs_prev = null;//before revs node(m-1th)
        Node revs_next = null; //after revend node(n+1 th)

        int counter  = 1;
        Node curr = head;

        while (curr!=null && counter <=n){
            if(counter < m){
                revs_prev = curr;
            }
            if (counter ==m){
                rev_start = curr;
            }
            if(counter == n){
                rev_end = curr;
                revs_next = curr.next;
            }
            curr = curr.next;
            counter = counter +1;

        }
        rev_end.next = null;
        rev_end = reverseLikedList(rev_start);
        if(revs_prev!=null){
            revs_prev.next = rev_end;
        }else {
            head = rev_end;

        }
        rev_start.next = revs_next;
        return head;
    }
    public int findPainrsum(int sum){
        return findPairSUm(head ,sum);
    }
    //1 1 1 2 2 2 2 3 3 3 4 4 4 6 6 6 7 7 8 8 8 9 9 9 9 10
    // 10 11 13 14 14 15 15 15 15 15 16 17 18 18 19 19 20 20
    // 20 21 21 21 21 22 22 23 24 25 25 25 25 25 27 28 28 29 30 30 32 35 35
    // 36 36 37 37 38 38 38 38 39 39 39 39 39 40 42 42 42 43 43 44 44 45 45
    // 46 47 47 48 48 49 49 49 49 50
    public int findPairSum(Node head ,int sum){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        Node p = head;
        while (p!=null){
            int curr = p.data;
            if(set.contains(sum - curr)){
                count++;
            }
            set.add(p.data);
            p = p.next;

        }
        return count;
    }
    public int findPairSUm(Node head , int k){
        int pairs = 0;
        Node curr = head;
        while (curr!=null){
            Node currNext = curr.next;
            while (currNext!=null){
                if(curr.data + currNext.data == k){
                    pairs++;
                }
                currNext = currNext.next;
            }
            curr = curr.next;
        }
        return pairs;
    }

}
