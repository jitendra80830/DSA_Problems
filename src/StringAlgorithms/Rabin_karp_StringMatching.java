package StringAlgorithms;

import java.util.Scanner;

public class Rabin_karp_StringMatching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String P = sc.next();
        int d = 26; //redix
        int q = 1000000007;
        rabin_karp_Algo(P , T , d , q);

    }

    private static void rabin_karp_Algo(String P, String T, int d, int q) {
        int n = T.length();
        int m  = P.length();
        int h = (int)Math.pow(d ,m-1);
        int p = 0;
        int t[] = new int[n-1+1];
        for (int i = 0; i <m ; i++) {
            p  = (d*p + (P.charAt(i) - 'a'))%q;
            t[0] = (d*t[0] +(T.charAt(i) - 'a'))%q;

        }
        for (int s = 0; s <=n-m ; s++) {
            if(p == t[s]){
                if(charMatching(T,P,s,m)){
                    System.out.println("character matched after "+s+" shifts");
                }
            }
            if(s < n-m){
                t[s+1] =(d*(t[s] - (T.charAt(s) - 'a') *h) + (T.charAt(s+m) - 'a'))%q;
            }

        }

    }

    private static boolean charMatching(String T, String P, int s, int m) {
        for (int j = 0; j <m ; j++) {
            if(P.charAt(j)!=T.charAt(j+s)){
                return false;
            }
        }
        return true;
    }
}
