package Graph;

import java.util.Scanner;

public class MaxAreaIsland {
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
        int maxAreaIsland = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(grid[i][j] == 1) {
                    int area = 0;
                    markISland(grid, i, j ,area);
                    Math.max(maxAreaIsland , area);
                }
            }
        }
        return maxAreaIsland;
    }

    private static void markISland(int[][] grid, int row, int col ,int area) {
        area++;
        grid[row][col] = 0;

        if(isValis(row - 1, col,grid)) {
            markISland(grid, row - 1, col,area);//up
        }
        if(isValis(row, col + 1,grid)) {
            markISland(grid, row, col + 1,area);//-right
        }
        if(isValis(row, col - 1,grid)) {
            markISland(grid, row, col - 1,area);//left
        }
        if(isValis(row + 1, col,grid)) {
            markISland(grid, row + 1, col,area);//down
        }
    }
    public static boolean isValis(int row ,int col,int grid[][]){
        if(row < grid.length && row >=0 && col < grid[0].length && col >=0 && grid[row][col] == 1){
            return true;
        }
        return false;
    }
}
