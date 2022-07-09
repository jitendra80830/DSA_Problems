package Arrays;

import java.io.IOException;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix1[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        int matrix2[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int add[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j  =0;j<n;j++){
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        int mul[][] = new int[m][n];
        int sum =0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                sum = 0;
                for(int k = 0;k<m;k++){
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                    mul[i][j] = sum;
                }
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
}
