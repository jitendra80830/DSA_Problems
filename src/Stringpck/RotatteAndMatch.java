package Stringpck;

import java.util.Scanner;

public class RotatteAndMatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        System.out.print(rotateString(s , goal));
    }

    private static boolean rotateString(String s, String goal) {
        char ch[] = s.toCharArray();
        int flag = 0;
        for (int i = 0; i < ch.length ; i++) {
            char leftChar  = ch[0];
            for (int j = 0; j <ch.length-1 ; j++) {
                ch[j] = ch[j+1];
            }
            ch[ch.length-1] = leftChar;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <ch.length ; j++) {
                sb.append(ch[j]);
            }
            String ans = "";
            ans = sb.toString();
            if(ans.equals(goal)){
                flag =1;
                break;

            }

        }
        if(flag == 1){
            return true;
        }else {
            return false;
        }
    }
}
