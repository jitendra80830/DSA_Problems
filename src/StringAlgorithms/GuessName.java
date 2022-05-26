package StringAlgorithms;

import java.util.Scanner;

public class GuessName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int len = s.length();
        int pi[] = new int[len];
        cpt(pi ,len ,s);
        //print l+(k-1)*(l-pi[l-1])<<endl;
        System.out.println(len+(k-1)*(len - pi[len-1]));


    }

    private static void cpt(int[] pi, int len, String s) {
        pi[0] = 0;
        int k = 0;
        for (int i = 1; i <len ; i++) {
            while (k >0 && s.charAt(k) !=s.charAt(i)){
                k = pi[k];
            }
            if(s.charAt(k) == s.charAt(i)){
                k++;
            }
            pi[i] = k;

        }
    }
}
