package Stringpck;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class FirstNonReapingChar {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        //{"b","c","a","d","b","c","a","e"};
        nonReapingChar(str);
    }

    private static void nonReapingChar(String str) {
        int len = str.length();
        int flag = 0;
        for(int i = 0;i<len;i++){
            flag=0;
            for(int j = i++;j<len;j++){
                if(str.charAt(i) == str.charAt(j)){
                    //System.out.println(str.charAt(i));
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(str.charAt(i));
                break;

            }
        }
    }
}
