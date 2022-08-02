package Stringpck;

import java.util.HashSet;
import java.util.Scanner;

public class First_Letter_to_Appear_Twice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(first_Letter_to_Appear_Twice(str));
    }

    private static char first_Letter_to_Appear_Twice(String str) {
        HashSet<Character> set = new HashSet<>();
        char ans  = ' ';
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(set.contains(ch)){
                ans = ch;
                break;
            }
            set.add(ch);
        }
        return ans;
    }

}
