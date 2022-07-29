package Array2D;

import java.util.Scanner;

public class ReShapeMat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = matrixReshape(mat , r , c);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public  static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m  = mat[0].length;
        if((n * m)!= (r*c)){
            return mat;
        }
        int ans[][] = new int[r][c];

        int row = 0;
        int col = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }
        return ans;

    }
}
