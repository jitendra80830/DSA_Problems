package Array2D;

import java.util.HashSet;
import java.util.Scanner;

public class CheckAllNumberContains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(checkValid(matrix));
    }

    private static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int r[] = new int[n+1];
        int c[] = new int[n+1];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                r[matrix[i][j]]++;
                if(r[matrix[i][j]] > i+1){
                    return false;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                c[matrix[j][i]]++;
                if(c[matrix[j][i]] > i+1){
                    return false;
                }
            }
        }
        return true;
    }
}
