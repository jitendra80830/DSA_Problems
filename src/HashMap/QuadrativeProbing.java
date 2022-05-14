package HashMap;

import java.util.Scanner;

public class QuadrativeProbing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        QHashTableSlots hashTable = new QHashTableSlots(capacity);
        for (int i = 0; i <8 ; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            hashTable.insert(key ,value);
        }
        hashTable.display();
        if(hashTable.search(20)){
            System.out.println("element present");
        }else {
            System.out.println("not present");
        }
        System.out.println(hashTable.getSize());
        hashTable.clean();
        System.out.println(hashTable.getSize());

    }
}
class QHashSlot{
    int key;
    int value;
    public QHashSlot(int key ,int value){
        this.key = key;
        this.value = value;
    }
}
class QHashTableSlots{
    private int TABLE_SIZE;
    private int size;
    private QHashSlot[] table;
    public QHashTableSlots(int capacity){
        TABLE_SIZE = capacity;
        size = 0;
        table = new QHashSlot[TABLE_SIZE];
        for (int i = 0; i <TABLE_SIZE ; i++) {
            table[i] = null;
        }
    }
    int getSize(){
        return size;
    }
    public void clean(){
        for (int i = 0; i <TABLE_SIZE ; i++) {
            table[i] = null;
        }
        size = 0;
    }
    public void insert(int key , int value){
        int index = key% TABLE_SIZE;
        int i = index;
        int p =1;
        do {
            if(table[i] == null){
                table[i] = new QHashSlot(key ,value);
                size++;
                return;
            }
            if(table[i].key == key){
                System.out.println("Duplicate key not allowed");
                return;
            }
            i = (index + (p*p))%TABLE_SIZE;
            p++;
        }while (i!=index);
        System.out.println("HashTable full");

    }
    public boolean search(int key){
        int index = key%TABLE_SIZE;
        int i = index;
        int p =1;
        do {
            if(table[i] == null){
                return false;
            }
            if(table[i].key == key){
                return true;
            }
            i = (index + (p*p));
            p++;
        }while (i!=index);
        return false;
    }
    public void display(){
        for (int i = 0; i <TABLE_SIZE ; i++) {
            if(table[i] == null){
                System.out.println("HashTable ["+i+"] no element");
            }else {
                System.out.println("HashTable ["+i+"] has element");
                System.out.println("key = "+table[i].key+" value = "+table[i].value);
            }

        }
    }
}
