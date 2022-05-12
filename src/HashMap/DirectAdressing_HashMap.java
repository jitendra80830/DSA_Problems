package HashMap;

import java.util.Scanner;

public class DirectAdressing_HashMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        HashTable hashTable = new HashTable(capacity);
        for (int i = 0; i <capacity ; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            hashTable.insert(key ,value);
        }
        hashTable.printHashTable();
        System.out.println(hashTable.getValue(11));
        System.out.println(hashTable.getSize());
        hashTable.clear();
        System.out.println(hashTable.getSize());
    }

}
class LinkedHash{
    int key;
    int value;
    LinkedHash next;
    public  LinkedHash(int key , int value){
        this.key = key;
        this.value = value;
        next = null;
    }
}
class  HashTable{
    private int TABLE_SIZE;
    private  int size;
    private LinkedHash table[];
    public HashTable(int capacity){
        size = 0;
        TABLE_SIZE = capacity;
        table = new LinkedHash[TABLE_SIZE];
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
    public int getValue(int key){
        int hash = (key % TABLE_SIZE); //calculating hash value(index)
        if(table[hash] == null){ //if in table node is null the return -1 simple
            return -1;
        }else { //nhi to
            LinkedHash entry = table[hash]; //entry is  1st  node
            while (entry!=null && !(entry.key == key)){ // if entry node is null and not equal key with exit key
                entry = entry.next; // go next node
            }
            if(entry== null){ //if entry node hi null hai to return -1
                return -1;
            }else {
                return entry.value; //nhi to return that value
            }
        }

    }
    public void insert(int key , int value){
        int hash = (key % TABLE_SIZE); //calculating hash value (means index)
        if(table[hash] == null){ //if at that index(hash value) in table null then create linkedList
            table[hash] = new LinkedHash(key , value);
        }
        else {
            LinkedHash entry = table[hash];
            while (entry.next!=null){ //go in last node
                entry = entry.next;
            }
            if(entry.key == key){ // if key duplicate then return
                System.out.println("duplicate key are not allowed");
                return;
            }else { // nhi to in last node create new node and insert new node with key,value
                entry.next = new LinkedHash(key,value);
            }
        }
        size++;
    }
    public void printHashTable(){
        for (int i = 0; i <TABLE_SIZE ; i++) {
            System.out.println("in buckets "+ (i+1)+ " : ");
            LinkedHash entry = table[i];
            while (entry!=null){
                System.out.println("[Key = "+entry.key+" Value = "+entry.value+ "]");
                entry = entry.next;
            }

        }
    }
}
