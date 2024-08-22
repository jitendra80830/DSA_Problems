package StringAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringWithConcatanation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();
        String [] p = new String[n];
        for (int i = 0; i <n ; i++) {
            p[i] = sc.next();
        }
        neiveStringMatching(t , p);
    }

    private static void neiveStringMatching(String t, String[] p) {
        //int counter = 0;
        List<Integer> ans = new ArrayList<>();
        int flag = 0;
        int n = t.length();
        int m =p.length;
        for (int i = 0; i <m ; i++) {

            for (int s = 0; s <= n - m; s++) { // it will run till n-m
                if (matchingstring(s, m, t, p[i])) { // if p's and t's value matching then print matched
                    //counter++;
                    ans.add(i+1);
                    //System.out.println("Matched after " + s + " shift");
                    flag = 1;
                }
                if(flag == 1){
                    break;
                }


            }
        }
        System.out.println(ans);
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
