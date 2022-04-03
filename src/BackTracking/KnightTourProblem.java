package BackTracking;

import java.util.Scanner;

public class KnightTourProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = -1;
            }
        }
        int move_x[] = {2 ,1,-1,-2,-2,-1,1,2};
        int move_y[] = {1,2,2,1,-1,-2,-2,-1};
        board[0][0] = 0;
        int pos  = 1; // position

        if(!knightTour(board , n , move_x , move_y , 0 ,0 ,pos)){
            System.out.println("Solution not exits");
        }else {

            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.print(board[i][j] +" ");
                }
                System.out.println();
            }

        }
    }

    private static boolean knightTour(int[][] board, int n, int[] move_x, int[] move_y,
                                      int curr_X, int curr_y, int pos) {
        if(pos == n*n){
            return true;
        }
        for (int i = 0; i <8 ; i++) {
            int new_x = curr_X + move_x[i];
            int new_y = curr_y + move_y[i];
            if(isValid(board , new_x , new_y ,n)){
                board[new_x][new_y] = pos;
                if(knightTour(board , n , move_x , move_y , new_x , new_y , pos+1)){
                    return true;
                }
                board[new_x][new_y] = -1;
            }

        }
        return false;


    }

    private static boolean isValid(int[][] board, int x, int y, int n) {
        if(x >=0 && y >=0 && x < n && y <n && board[x][y]==-1){
            return true;
        }else {
            return false;
        }
    }
}
