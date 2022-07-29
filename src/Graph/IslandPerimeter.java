package Graph;

import java.util.Scanner;

public class IslandPerimeter {
     static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int grid[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(numIslands(grid));
    }

    private static int numIslands(int[][] grid) {
        count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(grid[i][j] == 1) {
                    markISland(grid, i, j);
                    break;

                }
            }
        }
        return count ;
    }

    private static void markISland(int[][] grid, int row, int col) {
        if(row >= grid.length || row < 0 || col >= grid[0].length || col <0 || grid[row][col] == 0){
            count++;
            return;
        }
        if(grid[row][col] ==2){
            return;
        }
        grid[row][col] = 2;
        markISland(grid , row-1,col);//up
        markISland(grid , row,col+1);//-right
        markISland(grid , row,col-1);//left
        markISland(grid , row+1,col);//down
    }
}
