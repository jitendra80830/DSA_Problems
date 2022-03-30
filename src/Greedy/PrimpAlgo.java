package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class PrimpAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.addEdges(u , v ,w);

        }
        g.primsAlgo();


    }

}
class Graph{
    int addjMat[][];
    int node;
    public Graph(int n){
        node = n;
        addjMat = new int[n][n];
    }
    void addEdges(int u , int v , int w){
        addjMat[u][v] = w;
        addjMat[v][u] = w;
    }
    void primsAlgo(){
        int result[] = new int[node];
        Arrays.fill(result , -1);

        boolean mst[] = new boolean[node];

        int minimumWt[] = new int[node];
        Arrays.fill(minimumWt , Integer.MAX_VALUE);

        for (int i = 0; i <node-1 ; i++) {
            int minW = minWt(minimumWt , mst);
            mst[minW] = true;
            for (int j = 0; j <node ; j++) {
                if(addjMat[minW][j] > 0 && !mst[j]){
                    if(minimumWt[j] > addjMat[minW][j]){
                        result[j] = minW;
                        minimumWt[j] = addjMat[minW][j];
                    }
                }

            }

        }
        for (int i = 1; i <node ; i++) {
            System.out.println(result[i] + " to "+i);

        }

    }

    private int minWt(int[] minimumWt, boolean[] mst) {
        int index = -1;
        for (int i = 0; i <node ; i++) {
            if(!mst[i] && (index == -1 || minimumWt[index] > minimumWt[i])){
                index = i;
            }

        }
        return index;
    }
}
