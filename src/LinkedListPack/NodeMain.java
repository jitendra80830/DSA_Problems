package LinkedListPack;
import java.util.*;
public class NodeMain {
    public static void main(String[] args) throws Exception {
        ///LinkedList<Integer> list = new LinkedList<>();
//        list.insertBeg(11);
//        list.insertBeg(19);
//        list.insertBeg(12);
//        list.insertBeg(1);
//        //list.print();
//        System.out.println();
//        list.insertEnd(16);
//        list.insertEnd(1);
//        list.insertEnd(16);
//        list.insertEnd(11);
//        list.insertEnd(19);
//        list.insertEnd(12);
//        list.insertEnd(14);
//        //list.print();
//        //System.out.println();
//        //list.insertMid(15,5);
//        list.print();
//        System.out.println();
//        //list.deleteBeg();
//        //list.deleteEnd();
//        //list.deleteMid(15);
//        list.print();
//        System.out.println();
//        list.deleteEnd();
//        list.print();
//        System.out.println();
//        System.out.println(list.size());
//       // list.size();
//        list.addAtIndex(6,2);
//        list.print();
//        System.out.println();
//        System.out.println(list.size());
//        System.out.println(list.getAtIndex(4));
//          System.out.println(list.maxPalindromeLen());
//          list.reverseBtRange(2,4);

        Node[] arr = new Node[3];
        arr[0] = new Node(4);
        arr[0].next = new Node(6);
        arr[0].next.next = new Node(8);
        arr[0].next.next.next = new Node(10);
        arr[0].next.next.next.next = new Node(15);

        arr[1] = new Node(1);
        arr[1].next = new Node(5);
        arr[1].next.next = new Node(9);


        arr[2] = new Node(2);
        arr[2].next = new Node(3);
        arr[2].next.next = new Node(7);
        arr[2].next.next.next = new Node(11);

        LinkedList<Integer> list = new LinkedList<>();

        Node head = list.mergeKLists(arr);
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

}
