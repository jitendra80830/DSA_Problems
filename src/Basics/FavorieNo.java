package Basics;

import java.util.Scanner;

public class FavorieNo {
    public static void main(String[] args){
        int rem;
        int count =0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        while (n!=0){
            rem = n % 10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        int g = 3;
        System.out.print(++g * 8);
    }

}
