package StringAlgorithms;

import java.util.Scanner;

public class PiTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String P = sc.next();

        int piTable[] = findPitbale(P);
        for (int i = 1; i <=piTable.length ; i++) {
            System.out.print(piTable[i]+" ");

        }
    }

    private static int[] findPitbale(String p) {
        int m = p.length();
        int pi[] = new int[m];
        pi[1] = 0;
        int k =0;
        for (int q = 2; q <m ; q++) {
            while (k > 0 && p.charAt(k+1)!=p.charAt(q)){
                k = pi[k];
            }
            if(p.charAt(k+1)== p.charAt(q)){
                k = k+1;
            }
            pi[q] = k;

        }
        return pi;
    }
}
