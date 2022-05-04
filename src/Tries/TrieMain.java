package Tries;

import java.util.Scanner;

public class TrieMain {
    public static void main(String[] args){
        String key[] = {"pre","prep" , "prepbytes" ,"prepbyte","proper"};
        TriMethod tm = new TriMethod();
        tm.root = new TrieNode();
        for (int i = 0; i < key.length ; i++) {
            tm.insert(key[i]);
        }
        tm.display(tm.root , "" , 0);
//        if(tm.search("sout")){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
        //tm.delete("pre");
        //tm.printAutoSuggession(tm.root , "so");
        System.out.println(tm.lcpTrie(tm.root));







// /       tm.display(tm.root , "" , 0);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       // int m = sc.nextInt();
//        String strIn[] = new String[n];
//        TriMethod tm = new TriMethod();
//        for (int i = 0; i <n ; i++) {
//            strIn[i] = sc.next();
//        }
//        for (int i = 0; i <n ; i++) {
//            tm.insert(strIn[i]);
//        }
//        if(tm.search("arn")){
//            System.out.println("Yes");
//        }else {
//            System.out.println("NO");
//        }
//        String strOut[] = new String[m];
//        for (int i = 0; i <m ; i++) {
//            strOut[i] = sc.next();
//        }
//        for (int i = 0; i <m ; i++) {
//            if(tm.search(strOut[i])){
//                System.out.println("Present");
//            }else {
//                System.out.println("Not");
//            }
//
//        }

    }
}
