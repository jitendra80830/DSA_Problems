package StringAlgorithms;

import java.util.Scanner;

public class Rabin_karp_StringMatching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String P = sc.next();
        int d = 26;
        int q = 1000000007;
        rabin_kaep_Algo(P , T , d , q);

    }

    private static void rabin_kaep_Algo(String P, String T, int d, int q) {
        int n = T.length();
        int m  = P.length();

    }
}
