package Tries;

import java.util.Scanner;

public class TrieMain {
    public static void main(String[] args){
//        String key[] = {"pre","prep" , "prepbytes" ,"prepbyte","proper"};
//        TriMethod tm = new TriMethod();
//        tm.root = new TrieNode();
//        for (int i = 0; i < key.length ; i++) {
//            tm.insert(key[i]);
//        }
//
//        tm.display(tm.root , "" , 0);
//        //tm.search("pre");
//        if(tm.search("sout")){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
        //tm.delete("pre");
        //tm.printAutoSuggession(tm.root , "so");
        //System.out.println(tm.lcpTrie(tm.root));







// /       tm.display(tm.root , "" , 0);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TriMethod tm = new TriMethod();
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
