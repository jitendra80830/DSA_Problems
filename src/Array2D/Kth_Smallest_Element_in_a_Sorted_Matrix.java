package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        System.out.println(kthSmallest(matrix , k));
    }

    private static int kthSmallest(int[][] matrix, int k) {
        int ans[] = new int[matrix.length * matrix.length];
        int index  = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                ans[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}
