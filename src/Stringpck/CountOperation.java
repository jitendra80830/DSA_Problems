package Stringpck;

import java.util.Scanner;

public class CountOperation {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        countOperation(str);
    }
    public static void countOperation(String str){
        int n = str.length();
        int diff = 0;
        int count = 0;
        for(int i =0;i<n;i++){
            for (int j = n-1;j>=0;j--){
                if(str.charAt(i) > str.charAt(j)){
                    diff = str.charAt(i) - str.charAt(j);
                    count  =diff;
                }
                else if(str.charAt(i) < str.charAt(j)){
                    diff = str.charAt(j) - str.charAt(i);
                    count = diff;
                }else if(str.charAt(i) == str.charAt(j)){
                    count = 0;
                }
            }

        }
        System.out.println(count);
    }
}
