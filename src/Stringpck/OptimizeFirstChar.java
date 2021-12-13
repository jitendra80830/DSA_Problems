package Stringpck;

import java.util.Scanner;

public class OptimizeFirstChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int freque[] = new int[26]; // frequency array o to 26
        int flag = 0;
        for(int i =0;i<str.length();i++){
            freque[str.charAt(i) - 97]++; // incrementing frequency of that's char of string
        }
        for(int i =0;i<str.length();i++){
            if(freque[str.charAt(i) - 97] == 1){ //  if in frequency array frequency is 1 then print that char
                System.out.println(str.charAt(i));
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("-1");
        }
    }
}
