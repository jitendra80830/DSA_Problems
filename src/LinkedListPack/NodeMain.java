package LinkedListPack;

public class NodeMain {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertBeg(11);
        list.insertBeg(19);
        list.insertBeg(12);
        list.insertBeg(1);
        //list.print();
        System.out.println();
        list.insertEnd(16);
        list.insertEnd(1);
        list.insertEnd(16);
        list.insertEnd(11);
        list.insertEnd(19);
        list.insertEnd(12);
        list.insertEnd(14);
        //list.print();
        //System.out.println();
        //list.insertMid(15,5);
        list.print();
        System.out.println();
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
          System.out.println(list.maxPalindromeLen());
          list.reverseBtRange(2,4);

    }
}
