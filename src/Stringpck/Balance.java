package Stringpck;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        balance(str);

    }
    public static void balance(String str){
        int count = 1;
        char ch[] = str.toCharArray();
        if(str.length() % 2 == 0){
            count = 0;
            for(int i =0;i<str.length();i++){
                if(count > -2){
                    if(ch[i] == '('){
                        count++;
                    }
                    if(ch[i] == ')'){
                        count--;
                    }
                }

            }
        }
        if(count == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

//import java.util.*;
//  import java.io.*;
//  public class Main {
//    public static void main(String args[]) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int i,count=1;
//            String str =sc.next();
//            char []s=str.toCharArray();
//            if(str.length()%2==0) {
//                count =0;
//                for (i = 0; i < str.length(); i++) {
//                    if (count > -2) {
//                        if (s[i] == '(') {
//                            count++;
//                        }
//                        if (s[i] == ')') {
//                            count--;
//                        }
//                    }
//                }
//            }
//                if (count == 0){
//                    System.out.println("YES");
//                }
//                else{
//                    System.out.println("NO");
//                }
//        }
//    }
//}