package Stringpck;

import java.util.Scanner;

public class PlayingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            int count = 0;
            for (int i = 0; i <5 ; i++) {
                String s1 = sc.next();
                if((s.charAt(0) == s1.charAt(0)) || (s.charAt(1) == s1.charAt(1))){
                    count++;
                }

            }
            if(count > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
