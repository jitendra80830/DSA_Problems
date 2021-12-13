package Searching;

import java.util.Scanner;

public class NoOfXOccur {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String str = sc.nextLine();
        char ch[] = new char[n];
        for(int i =0;i<n;i++){
            ch[i] = sc.next().charAt(0);
        }
        xOccurence(ch);

    }

    private static void xOccurence(char[] ch) {
        int len = ch.length;
        int count = 0;
        for(int i =0;i<len;i++){
            if(ch[i] == 'x'){
                count++;
            }
        }
        System.out.println(count);
    }

}
