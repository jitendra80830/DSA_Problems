package DoublyLinkedList;

public class DDLMain {
    public static void main(String[] args){
        DoublyLinkedlist dLL = new DoublyLinkedlist();
        dLL.insertBeg(2);
        dLL.insertBeg(4);
        dLL.insertBeg(5);
        dLL.insertBeg(1);
        dLL.print();
        System.out.println();
        dLL.insertEnd(7);
        dLL.print();
        System.out.println();
        dLL.insertMid(4,6);
        dLL.print();

    }
}
