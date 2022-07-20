package Arrays;

import java.util.Scanner;

public class GoldMineProblem {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gold[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                gold[i][j] = sc.nextInt();
            }
        }
        System.out.print(getMaxGold(gold,n,m));
    }

    private static int getMaxGold(int[][] gold, int n, int m) {

        int maxGold = 0;

        for (int i = 0; i < n; i++) {
            int goldCollected = collectGold(gold,i,0,n,m);
            maxGold = Math.max(maxGold , goldCollected);
        }
        return maxGold;
    }

    private static int collectGold(int[][] gold, int x, int y, int n, int m) {
        if((x < 0) || (x == n) || (y == m)){
            return 0;
        }
        //right upper diagonal
        int rightUpper = collectGold(gold,x-1 , y+1,n,m);

        // right
        int right = collectGold(gold ,x ,y+1,n,m);

        //lower right diagonal

        int rightLower = collectGold(gold,x+1,y+1,n,m);

        return gold[x][y] + Math.max(Math.max(rightLower , rightUpper) , right);

    }
}