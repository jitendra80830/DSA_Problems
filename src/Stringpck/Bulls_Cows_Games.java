package Stringpck;

import java.util.Scanner;

public class Bulls_Cows_Games {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String secret = sc.next();
        String guess = sc.next();
        System.out.println(getHint(secret , guess));
    }

    private static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int number[] = new int[10];
        for (int i = 0; i <secret.length() ; i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                bulls++;
            }else {
                if(number[s] < 0){
                    cows++;
                }
                if(number[g] > 0){
                    cows++;
                }
                number[s]++;
                number[g]--;
            }
        }
        return bulls + "A"+ cows + "B";
    }

}
