package Stringpck;

import java.util.Scanner;

public class DuplicateChar2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        duplicateChar(str);
    }

    private static void duplicateChar(String str) {
        int len = str.length();
        int freque[] = new int[26];
        int flag = 0;
        for(int i =0;i<len;i++){
            freque[str.charAt(i) - 97]++; //if char a = 97,then a -97 means 97-97 = 0(index) at this index we can increment value for frequency
        }
        for(int i = 0;i <26;i++){
            if(freque[i] > 1){
                flag = 1;
                System.out.print((i+'a')+"="+ freque[i]+" ");

            }
        }
        if(flag == 0){
            System.out.print("-1");
        }
    }

}
