package Stringpck;

import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        String x = str.trim();
        int count = 0;
        for (int i = 0; i<x.length(); i++) {
            if(x.charAt(i) == ' '){
                count = 0;
            }else {
                count++;
            }

        }
        System.out.println(count);
    }
}
