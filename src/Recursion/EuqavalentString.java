package Recursion;

import java.util.Scanner;

public class EuqavalentString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(equavalentString(a , b)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean equavalentString(String a, String b) {
        //base case
        return !(leastLexiString(a).equals(leastLexiString(b)));
    }

    private static String leastLexiString(String str) {
        int n = str.length();
        if(n == 1){
            return str;
        }
        String x = leastLexiString(str.substring(0 , n/2));
        String y = leastLexiString(str.substring(n/2));
        return String.valueOf((x + y).compareTo(y+x));

    }
}
