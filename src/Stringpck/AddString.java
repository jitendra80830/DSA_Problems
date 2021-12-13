package Stringpck;

import java.util.Scanner;

public class AddString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i =0;i<str.length;i++){
            str[i] = sc.nextLine();
        }
        addStringArray(str);

    }
    public static void addStringArray(String str[]){
        int sum = 0;
        for(int i =0;i<str.length;i++){
            String string = str[i];
            for(int j =0;j<string.length();j++){
                sum = sum+ Integer.parseInt(String.valueOf(string.charAt(j)));

            }
        }
        System.out.println(sum);
    }
}
