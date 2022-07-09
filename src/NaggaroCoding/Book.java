package NaggaroCoding;

import java.util.Scanner;

public class Book {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();;
        int input3[] = new int[input1];
        for (int i = 0; i <input1 ; i++) {
            input3[i] = sc.nextInt();
        }
        int input4[] = new int[input1];
        for (int i = 0; i <input1 ; i++) {
            input4[i] = sc.nextInt();
        }
        System.out.println(books(input1 , input2 , input3 , input4));

    }

    private static int books(int input1, int input2, int[] input3, int[] input4) {
        int k[][] = new int[input1+1][input2+1];
        int i = 0;
        int j = 0;
        for ( i = 0; i <=input1 ; i++) {
            for (j = 0; j <=input2 ; j++) {
                if(i == 0 || j == 0){
                    k[i][j] = 0;
                }else if(input4[i-1] <= j){
                    k[i][j] = Math.max(input3[i-1] + k[i-1][j-input4[i-1]] , k[i-1][j]);
                }else {
                    k[i][j] = k[i-1][j];
                }
            }
        }
        return k[input1][input2];
    }
}
