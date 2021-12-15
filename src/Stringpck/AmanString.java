package Stringpck;

import java.util.*;
import java.io.*;

class AmanString {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int count = 0;

            for(int i =0;i<str.length();i++){
                int idx = -1;
                for(int j =i;j+3<str.length();j++){
                    if(str.charAt(j) =='a' && str.charAt(j+1) =='m' && str.charAt(j+2) =='a' && str.charAt(j+3) =='n'){
                        idx = j-i;
                        break;
                    }
                }
                if(idx !=-1){
                    count +=str.length()-(i+3+idx);
                }

            }
            System.out.println(count);
        }
    }
}