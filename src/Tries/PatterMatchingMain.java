package Tries;

import java.util.Scanner;

public class PatterMatchingMain {
    public static void main(String[] args){
//        PattternMatchingMethod pm = new PattternMatchingMethod();
//        String text[] = {"pr", "ep", "by", "tes", "pr" };
//        String pattern = "ep";
//        for (int i = 0; i <text.length ; i++) {
//            pm.insert(text[i]);
//        }
//        pm.matchPattern(pattern);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i <n ; i++) {
            str[i] = sc.next();
        }
        PattternMatchingMethod p = new PattternMatchingMethod();
        for (int i = 0; i <n ; i++) {
            p.insert(str[i]);
        }
       // p.matchPattern("pr");
        int t = sc.nextInt();
        while (t-->0){
            String pattern = sc.next();
            p.matchPattern(pattern);

        }
    }
}
