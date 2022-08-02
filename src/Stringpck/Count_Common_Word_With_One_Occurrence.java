package Stringpck;

import java.util.HashMap;
import java.util.Scanner;

public class Count_Common_Word_With_One_Occurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String word1[] = new String[n];
        String word2[] = new String[m];

        for (int i = 0; i <n ; i++) {
            word1[i] = sc.next();
        }
        for (int i = 0; i <m ; i++) {
            word2[i] = sc.next();
        }
        System.out.println(countWords(word1 , word2));
    }

    private static int countWords(String[] word1, String[] word2) {

        HashMap<String , Integer> map1 = new HashMap<>();
        HashMap<String , Integer> map2 = new HashMap<>();

        for (int i = 0; i <word1.length ; i++) {
            map1.put(word1[i] , map1.getOrDefault(word1[i] , 0)+1);
        }
        for (int i = 0; i <word2.length ; i++) {
            map2.put(word2[i] , map2.getOrDefault(word2[i] , 0)+1);
        }
        System.out.println(map1);
        System.out.println(map2);

        int count = 0;
        for (String s : map1.keySet()){
            //System.out.println(map1.get(s));

            if(map2.containsKey(s)){
                if(map1.get(s) ==1 && map2.get(s)==1){
                    count++;
                }
            }

        }
        return count;
    }
}
