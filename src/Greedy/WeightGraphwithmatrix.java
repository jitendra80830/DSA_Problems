package Greedy;

import java.util.Scanner;

public class WeightGraphwithmatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            addEdges(arr , u , v , w);
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println("weight of edges from "+i+" to "+j+" is "+arr[i][j]);
            }
            System.out.println();

        }
    }

    private static void addEdges(int[][] arr, int u, int v, int w) {
        arr[u][v] = w;
        arr[v][u] = w;
    }
}
