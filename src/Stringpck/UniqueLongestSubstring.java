package Stringpck;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueLongestSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(longestUniqueSubString(str));
    }

    private static int longestUniqueSubString(String str) {
        int ans = 0;
        int  i = -1;
        int j = -1;
        HashMap<Character , Integer> map = new HashMap<>();

        while (true){
            //Aquire
            boolean flag1 = false;
            boolean flag2 = false;
            while (i < str.length()-1){
                flag1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch , map.getOrDefault(ch , 0)+1);
                if(map.get(ch) == 2){
                    break;
                }else {
                    int len = i - j;
                    if(ans < len){
                        ans = len;
                    }
                }
            }
            //release
            while (j < i){
                flag2 = true;
                j++;
                char ch = str.charAt(j);
                map.put(ch , map.get(ch) -1);
                if(map.get(ch) == 1){
                    break;
                }
            }
            if(flag1 == false && flag2 == false){
                break;
            }

        }
        return ans;
    }
}
