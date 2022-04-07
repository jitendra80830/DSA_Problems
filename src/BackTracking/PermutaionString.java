package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PermutaionString {
    static ArrayList<String> ans;
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            ans = new ArrayList<>();
            String s = sc.next();
            int n = s.length();
            permutaion(s , n , 0);
            Collections.sort(ans);
            for (String str : ans){
                System.out.println(str);
            }
        }
    }

    private static void permutaion(String s, int n, int i) {
        if(i == n-1){
            ans.add(s);
            return;
        }
        for (int j = i; j <n ; j++) {
            s = swap(s , i ,j);
            permutaion(s , n ,i+1);
            s = swap(s  , i , j);
        }
    }

    private static String swap(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i , s.charAt(j));
        sb.setCharAt(j , s.charAt(i));
        return sb.toString();
    }
}
