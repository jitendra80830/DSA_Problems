package Stringpck;

import java.util.Scanner;

public class MinusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        minusPlus(s, t);

        }

    private static void minusPlus(String s, String t) {
        int diff = 0;
        int flag = 0;
        if ((s.length() == 0 && t.length() == 0) || (s.length() < t.length())) {
            flag = 0;
        } else {
            for (int i = 0; (i - diff) < t.length(); i++) {
                if (t.charAt(i - diff) == '+' && s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                    i++;
                    diff++;
                } else if ((t.charAt(i - diff) == '+' && s.charAt(i) == '+') || (t.charAt(i - diff) == '-' && s.charAt(i) == '-')) {
                    flag = 0;
                } else {
                    flag = 1;
                    break;
                }
            }
        }
        if ((s.length() - diff) != t.length()) {
            flag = 1;
        }
        if (flag == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}