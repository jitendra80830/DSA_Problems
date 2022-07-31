package Array2D;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         int matrix[][] = new int[n][m];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(luckyNumbers(matrix));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(isMinMax( matrix , matrix[i][j] , i , j)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    private static boolean isMinMax(int matrix[][] ,int val, int row, int col) {

        int flag = 0;
        for (int c = 0; c <matrix[0].length ; c++) {
            if(val < matrix[row][c]){
                flag++;
            }
        }
        for (int r = 0; r <matrix.length ; r++) {
            if(val >  matrix[r][col]){
                flag++;
            }
        }
        if(flag == (matrix.length * matrix[0].length) -2){
            return true;
        }else {
            return false;
        }


    }


}
