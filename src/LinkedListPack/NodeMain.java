package LinkedListPack;

public class NodeMain {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
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
        list.deleteBeg();
        list.print();
    }
}
