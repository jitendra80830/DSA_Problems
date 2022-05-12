package HashMap;

import java.util.Scanner;

public class LinearProbingHashMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();;
        HashTableSlot hashTable = new HashTableSlot(capacity);
        for (int i = 0; i <6 ; i++) {
            int key = sc.nextInt();

            int value = sc.nextInt();
            hashTable.insert(key ,value);
        }
        hashTable.display();
        if(hashTable.searchElement(68)){
            System.out.println("Element is present");
        }else {
            System.out.println("Element is not present");
        }
        System.out.println(hashTable.getSize());
        hashTable.clear();
        System.out.println(hashTable.getSize());


    }
}
class HashSlots{
    int key;
    int value;
    public  HashSlots(int key , int value){
        this.key = key;
        this.value = value;
    }

}
class HashTableSlot{
    private int TABLE_SIZE;
    private int size;
    private HashSlots[] table;
    public HashTableSlot(int capacity){
        TABLE_SIZE = capacity;
        size = 0;
        table = new HashSlots[TABLE_SIZE];
        for (int i = 0; i <TABLE_SIZE ; i++) {
            table[i] = null;
        }
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        for (int i = 0; i <TABLE_SIZE ; i++) {
            table[i] = null;
        }
        size = 0;
    }
    public void insert(int key , int value){
        int index = key%TABLE_SIZE;
        int i = index;
        do{
            if(table[i] == null){
                table[i] = new HashSlots(key ,value);
                size++;
                return;
            }
            if(table[i].key == key){
                System.out.println("Duplicate key not allowed");
                return;
            }
            i = (i+1)%TABLE_SIZE;

        }while (i!=index);
        System.out.println("HashTable is full");

    }
    boolean searchElement(int key){
        int index = key%TABLE_SIZE;
        int i = index;
        do {
            if(table[i] == null){
                return false;
            }
            if(table[i].key == key){
                return true;
            }
            i = (i+1)%TABLE_SIZE;

        } while (i!=index);
        return false;
    }
    public void display(){
        for (int i = 0; i <TABLE_SIZE ; i++) {
            if(table[i] == null){
                System.out.println("HashTable ["+i+"] no element");
            }else {
                System.out.println("HashTable ["+i+"] has element ");
                System.out.println("Key = "+table[i].key+" value = "+table[i].value);
            }
        }
    }

}
