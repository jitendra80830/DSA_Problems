package Recursion;

import java.util.Scanner;

public class NumberCombination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 2;
        String str = "1";
        printNumberCombination(n , p , str);
    }

    private static void printNumberCombination(int n, int p, String str) {
        if(n==1){
            System.out.println(str);
            return;
        }else {
            for(int i =p;i<=n;i++){
                if(n % i == 0){
                    printNumberCombination(n/i , i , str+" "+i);
                }
            }
        }
    }
}
