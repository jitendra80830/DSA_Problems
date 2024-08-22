package Stringpck;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for (int i = 0; i <n ; i++) {
            strs[i] = sc.next();
        }
        System.out.println(longesctCommonPrefix(strs));
    }

    private static String longesctCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length ; i++) {
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0 , prefix.length()  -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
