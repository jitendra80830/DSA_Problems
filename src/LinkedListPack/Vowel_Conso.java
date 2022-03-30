package LinkedListPack;

import java.util.*;

public class Vowel_Conso {
    public static void main(String[] args){
        LinkedList<Character> ll = new LinkedList<>();
        vowelConso(ll.head);
    }

    private static Node vowelConso(Node head) {
        ArrayList<Character> a = new ArrayList<>();


        Node curr = head;
        while (curr!=null){
            a.add((char) curr.data);
            curr = curr.next;
        }
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> conso = new ArrayList<>();

        int l = a.size();
        for (int i = 0; i <l ; i++) {
            if(a.get(i) == 'a' || a.get(i) == 'e' || a.get(i) == 'i' || a.get(i) == 'o'  || a.get(i) == 'u'){
                vowel.add(a.get(i));
            }else{
                conso.add(a.get(i));
            }

        }
        curr = head;
        int o = vowel.size();
        int temp = 0;
        int temp2 = 0;
        while (curr!=null){
            if(temp < o){
                curr.data = vowel.get(temp++);
            }else {
                curr.data = conso.get(temp2++);
            }
            curr = curr.next;
        }
        return head;
    }
}
