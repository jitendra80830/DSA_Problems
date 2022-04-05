package BackTracking;

import java.util.Scanner;

public class Rat_In_A_Maze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maze[][] = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        int result[][] = new int[n][n];
        if(rateInmaze(maze , result , 0,0 , n)){
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.print(maze[i][j]+" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Not exits solution");
        }
    }

    private static boolean rateInmaze(int[][] maze, int[][] result, int x, int y, int n) {
        if(x == n-1 && y == n-1){
            result[x][y] = 1;
            return true;
        }
        if(isValid(maze , x , y , n)){
            maze[x][y] = 1;
            if(rateInmaze(maze , result , x , y+1 , n)){ // right move
                return true;
            }
            if(rateInmaze(maze , result , x+1 , y , n)){ // left move
                return true;
            }
            //if both condition failed then make 0 means this not correct position
            maze[x][y] = 0;
            return false;
        }
        return false;

    }

    private static boolean isValid(int[][] maze, int x, int y, int n) {
        if(x >=0 && y >=0&& x < n && y <n && maze[x][y] == 1){
            return true;
        }else {
            return false;
        }
    }
}
