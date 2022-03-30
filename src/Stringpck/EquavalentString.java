package Stringpck;

import java.util.Scanner;

public class EquavalentString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();
        String b = sc.next();
        int len = a.length();
        if(equavalentStr(a ,b ,len)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean equavalentStr(String a, String b, int len) {
        if(a.equals(b)){
            return true;
        }
        if(len %2 ==1){
            return false;
        }

        String a1 = a.substring(0,len/2);
        String a2 = a.substring(len/2 , len);
        String b1 = b.substring(0,len/2);
        String b2 = b.substring(len/2 , len);
        if((equavalentStr(a1 , b1 , len/2) && equavalentStr(a2 , b2 , len/2)) || (equavalentStr(a1 , b2 , len/2)
        && equavalentStr(a2 , b1 , len/2))){
            return true;
        }else {
            return false;
        }

    }



}
