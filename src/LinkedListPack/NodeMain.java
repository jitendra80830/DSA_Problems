package LinkedListPack;

public class NodeMain {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertBeg(2);
        list.insertBeg(5);
        list.insertBeg(3);
        list.insertBeg(10);
        //list.print();
        System.out.println();
        list.insertEnd(12);
        list.insertEnd(18);
        //list.print();
        System.out.println();
        list.insertMid(15,5);
        list.print();
        System.out.println();
        //list.deleteBeg();
        //list.deleteEnd();
        list.deleteMid(15);
        list.print();
        System.out.println();
        list.deleteEnd();
        list.print();
        System.out.println();
        System.out.println(list.size());
       // list.size();
        list.addAtIndex(6,2);
        list.print();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.getAtIndex(4));

    }
}
