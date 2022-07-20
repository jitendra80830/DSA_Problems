package Stringpck;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPalindrome(str));
    }

    private static int longestPalindrome(String str) {
        Map<Character ,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            map.put(c , map.getOrDefault(c ,0) + 1);
        }
        int result = 0;
        boolean oddFond = false;
        for (int c : map.values()){
            if(c %2 ==0){
                result+=c;
            }else {
                oddFond = true;
                result+=c-1;
            }
        }
        if(oddFond){
            result++;
        }
        return result;
    }
}
