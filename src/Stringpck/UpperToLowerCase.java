package Stringpck;

import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ConvertToLowerCase(str);
    }

    private static String ConvertToLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for (int i = 0; i <s.length() ; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            sb.append(ch);
        }
        ans = sb.toString();
        return ans;
    }
}
