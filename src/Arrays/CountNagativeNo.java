package Arrays;

import java.util.Scanner;

public class CountNagativeNo {
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
        System.out.println(countNegatives(grid)); //TC = 0(n^2)
        System.out.println(countNegatives2(grid));


    }


    private static int countNegatives2(int[][] grid) {
        int n = grid[0].length;
        int i =0;
        int j = 0;
        int count = 0;
        while (j>=0 && i <grid.length){
            if(grid[i][j] <0){
                count+= (n-j) + 1;
                i++;
            }else {
                j--;

            }
        }
        return count;

    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] <0){
                    count++;
                }
            }
        }
        return count;

    }
}
