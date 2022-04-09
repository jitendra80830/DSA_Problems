package HeapPack;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SmallString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            int q = sc.nextInt();
            int len = str.length();
            StringBuilder newString = new StringBuilder();
            PriorityQueue<Character> mp = new PriorityQueue<>();
            for (int i = 0; i <q; i++) {

                mp.add(str.charAt(i));
            }
            newString.append(mp.peek());
            mp.remove();
            for (int i = q; i <len ; i++) {
                mp.add(str.charAt(i));
                newString.append(mp.peek());
                mp.remove();
            }
            for (int i = 0; i <q-1 ; i++) {
                newString.append(mp.peek());
                mp.remove();
            }
            System.out.println(newString);

        }
    }
}
