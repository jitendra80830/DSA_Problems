package Dvide_Conqure;

import java.util.Scanner;

public class Naruto_Sasuke {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <=K ; i++) {
            int nVal = A + (i * X);
            int sVal = B + ((K-i) * Y);
            if(nVal == sVal){
                flag = 1;
                System.out.println(i);
                break;
            }

        }
        if (flag == 0){
            System.out.println("-1");
        }
    }
}
