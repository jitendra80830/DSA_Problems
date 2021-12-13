package Stringpck;
import java.util.*;
import java.io.*;

public class DuplicateChar {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();

            char[] chars = str.toCharArray();
            int flag = 0;

            Map<Character , Integer> charMap = new HashMap<>();

            for(Character ch : chars){

                if(charMap.containsKey(ch)){
                    charMap.put(ch , charMap.get(ch) + 1);
                }else{
                    charMap.put(ch ,1);
                }
            }
            Set<Character> keys = charMap.keySet();
            for(Character ch : keys){
                if(charMap.get(ch) > 1){
                    flag = 1;
                    System.out.print(ch+"="+charMap.get(ch)+" ");
                }
            }
            if(flag == 0){
                System.out.print("-1");
            }
            System.out.println();
        }


    }
}
