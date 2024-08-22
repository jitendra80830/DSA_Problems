package Stringpck;

import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String pattern  = sc.next();
        System.out.println(wordPattern(pattern , word));
    }

    private static boolean wordPattern(String pattern, String s) {
        String word[]  = s.split(" ");
        if(pattern.length()!= word.length){
            return false;
        }
        HashMap<Character , String> map = new HashMap<>();
        HashMap<String , Boolean> used = new HashMap<>();
        for (int i = 0; i <pattern.length() ; i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)==false){
                if(used.containsKey(word[i]) == true){
                    return false;
                }else {
                    used.put(word[i] , true);
                    map.put(ch , word[i]);
                }
            }else {
                String mapval = map.get(ch);
                if(!mapval.equals(word[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
