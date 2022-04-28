package StringAlgorithms;

import java.util.Scanner;

public class KMPStringMatchingAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String P = sc.next();
        kmpStringMatcher(T ,P);

    }

    private static void kmpStringMatcher(String t, String p) {
        int n = t.length();
        int m = p.length();
        int arr[] = findPitbale(p);
        int q = 0;
        for (int i = 0; i <n ; i++) {
            while (q > 0 && p.charAt(q)!=t.charAt(i)){
                q = arr[q];
            }
            if(p.charAt(q) == t.charAt(i)){
                q = q+1;
            }
            if(q == m){
                System.out.println("Pattern occur with shift "+ (i-m)+" index");
                q = arr[q-1];
            }

        }
    }
    private static int[] findPitbale(String p) {
        int m = p.length();
        int pi[] = new int[m];
        pi[0] = 0;
        int k =0;
        for (int q = 1; q <m ; q++) {
            while (k > 0 && p.charAt(k)!=p.charAt(q)){
                k = pi[k];
            }
            if(p.charAt(k)== p.charAt(q)){
                k = k+1;
            }
            pi[q] = k;

        }
        return pi;
    }
}
