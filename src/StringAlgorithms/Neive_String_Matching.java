package StringAlgorithms;

import java.util.Scanner;

public class Neive_String_Matching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();
        neiveStringMatching(t , p);
    }

    private static void neiveStringMatching(String t, String p) {
        //int counter = 0;
        int n = t.length();
        int m =p.length();
        for (int s = 0; s <=n-m ; s++) { // it will run till n-m
            if(matchingstring(s , m,t,p)){ // if p's and t's value matching then print matched
                //counter++;
                System.out.println("Matched after "+s+" shift");

            }


        }
        //System.out.println(counter);
    }

    private static boolean matchingstring(int s, int m, String t, String p) {
        for (int j = 0; j <m ; j++) {
            if (p.charAt(j)!=t.charAt(j+s)){ // if p's and t's value not matching then return false
                return false;
            }

        }
        //other wise return true
        return true;
    }
}
