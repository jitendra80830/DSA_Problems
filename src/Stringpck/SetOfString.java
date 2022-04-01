package Stringpck;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class SetOfString {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        powerSet("abc");
    }

//    private static void sortString(String str) {
//        char ch[] = new char[str.length()];
//        long total = (long) Math.pow(2 , str.length());
//        for (int i = 1; i < total; i++) {
//
//
//        }
//
//    }
    static void permuteRec(String str, int n,
                           int index, String curr)
    {
        // base case
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {

            curr += str.charAt(i);
            permuteRec(str, n, i, curr);

            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
        return;
    }
    static void powerSet(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
        permuteRec(new String(arr), str.length(), -1, "");
    }

}
