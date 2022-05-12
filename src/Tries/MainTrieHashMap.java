package Tries;

import java.util.Scanner;

public class MainTrieHashMap {
    public static void main(String[] args){
//        String value[] = {"pre","prep" , "prepbytes" ,"prepbyte","proper"};
//
//        TriemethodHashMap tm = new TriemethodHashMap();
//
//        for (int i = 0; i <value.length ; i++) {
//            tm.insert(value[i]);
//        }
//        if(tm.search("preo")){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TriemethodHashMap tm = new TriemethodHashMap();
        while (n-->0){
            String text = sc.next();
            tm.insert(text);
        }

        while (m-->0){
            String word = sc.next();
            if(tm.search(word)){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }
        }
    }
}
