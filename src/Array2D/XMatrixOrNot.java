package Array2D;

import java.util.Scanner;

public class XMatrixOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        checkXMatrix(matrix);
    }

    private static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(isDiagonal(i , j ,n)){
                    if(grid[i][j] == 0){
                        return false;
                    }

                }else {
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isDiagonal(int row, int col, int n) {
        if(row == col){
            return true;
        }
        return ((row+col) == n-1);
    }
}
