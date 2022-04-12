package Graph;

import java.util.Scanner;

public class ConnectedGraph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        int arr[][] = new int[nodes][nodes];
        for (int i = 0; i <edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        connectedComponents(arr , nodes);
    }

    private static void connectedComponents(int[][] arr, int nodes) {
        boolean visited[] = new boolean[nodes];
        int count = 0;
        for (int i = 0; i <nodes ; i++) {

        }
    }


}
