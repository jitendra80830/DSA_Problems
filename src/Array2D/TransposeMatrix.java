package Array2D;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                matrix[i][j]  = sc.nextInt();
            }
        }
        int arr[][] = transpose(matrix);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = matrix[i][j];

            }
        }
        return ans;
    }
}
