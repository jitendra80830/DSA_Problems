package Graph;

import java.util.Scanner;

public class NoOfIslands {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char grid[][] = new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
       System.out.println(numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
        int noOgIsland = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(grid[i][j] == '1') {
                    markISland(grid, i, j);
                    noOgIsland += 1;
                }
            }
        }
        return noOgIsland;
    }

    private static void markISland(char[][] grid, int row, int col) {
        if(row >= grid.length || row < 0 || col >= grid[0].length || col <0 || grid[row][col]!='1'){
            return;
        }
        grid[row][col] = '2';
        markISland(grid , row-1,col);//up
        markISland(grid , row,col+1);//-right
        markISland(grid , row,col-1);//left
        markISland(grid , row+1,col);//down
    }
}
