package BackTracking;

import java.util.Scanner;

public class N_Queen_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        if (!nQueen(board, n, 0)) {
            System.out.println("Solution is not exits");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static boolean nQueen(int[][] board, int n, int col) {
        if (col >= n) {
            return true;
        }
        for (int row = 0; row < n; row++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 1;
                if (nQueen(board, n, col + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int n) {
        // for roe checking 0 to row-1
        for (int i = 0; i <col ; i++) {
            if(board[row][i] == 1){
                return false;
            }
        }
        // for upper diogonal checking
        for (int i = row , j = col; i >=0 && j>=0; i-- ,j--) {
            if(board[i][j] == 1){
                return false;
            }
        }
        //for down diagonal checking
        for (int i = row , j = col; i <n && j >=0 ; i++ ,j--) {
            if (board[i][j] ==1){
                return false;
            }
        }

        return true;

    }
}
