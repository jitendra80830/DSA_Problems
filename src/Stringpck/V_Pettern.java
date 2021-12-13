package Stringpck;

import java.util.Scanner;

public class V_Pettern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        int space = (line*2) - 2;

        for (int  i =1;i<=line;i++){ // loop for lines

            //left part
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            // space part
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            //right part
            for(int j =i;j >=1;j--){
                System.out.print(j);
            }
            space = space - 2;
            System.out.println();


        }
    }

}
