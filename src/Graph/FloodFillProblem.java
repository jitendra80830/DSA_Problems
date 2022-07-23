package Graph;

import java.util.Scanner;

public class FloodFillProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int image[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                image[i][j] = sc.nextInt();
            }
        }
        int sr = sc.nextInt();
        int sC = sc.nextInt();
        int newColor = sc.nextInt();
        int ans[][] = floodFill(image , sr ,sC , newColor);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] floodFill(int[][] image, int sr, int sC, int newColor) {
        if(newColor == image[sr][sC]){
            return image;
        }
        DFS(image , sr ,sC ,newColor ,image[sr][sC]);
        return image;
    }

    private static void DFS(int[][] image, int row, int col, int newColor, int oldColor) {
        if(row >= image.length || row < 0  || col>=image[0].length || col <0 || image[row][col]!=oldColor){
            return;
        }
        image[row][col] = newColor;
        DFS(image ,row -1 ,col,newColor ,oldColor);
        DFS(image ,row ,col+1,newColor,oldColor);
        DFS(image, row, col-1, newColor, oldColor);
        DFS(image, row+1, col, newColor, oldColor);
    }
}
