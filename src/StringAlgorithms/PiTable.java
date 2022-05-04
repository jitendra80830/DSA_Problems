package StringAlgorithms;

import java.util.Scanner;

public class PiTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String P = sc.next();

        int piTable[] = findPitbale(P);
//        for (int i = 0; i <piTable.length ; i++) {
//            System.out.print(piTable[i]+" ");
//
//        }
        //System.out.println();
        //System.out.println(piTable[P.length()-1]);
        int val = piTable[P.length()-1];
        System.out.println(val);
//        for (int i = 0; i <val ; i++) {
//            System.out.print(P.charAt(i));
//        }
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
