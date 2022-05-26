package Greedy;

import java.util.*;
import java.io.*;

public class AamanRekatice {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph1 g = new Graph1(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.addEdges(u , v ,w);

        }
        g.primsAlgo();

    }
}
class Graph1 {
    int addjMat[][];
    int node;
    public Graph1(int n){
        node = n;
        addjMat = new int[n+1][n+1];
    }
    void addEdges(int u , int v , int w){
        addjMat[u][v] = w;
        addjMat[v][u] = w;
    }
    void primsAlgo(){
        int result[] = new int[node+1];
        Arrays.fill(result , -1);

        boolean mst[] = new boolean[node+1];

        int minimumWt[] = new int[node+1];
        Arrays.fill(minimumWt , Integer.MAX_VALUE);

        for (int i = 1; i <=node-1 ; i++) {
            int minW = minWt(minimumWt , mst);
            mst[minW] = true;
            for (int j = 1; j <=node ; j++) {
                if(addjMat[minW][j] > 0 && !mst[j]){
                    if(minimumWt[j] > addjMat[minW][j]){
                        result[j] = minW;
                        minimumWt[j] = addjMat[minW][j];
                    }
                }

            }

        }
        int sum = 0;
        for (int i = 2; i <minimumWt.length ; i++) {
            sum=  sum + minimumWt[i];
        }
        System.out.println(sum);

    }

    private int minWt(int[] minimumWt, boolean[] mst) {
        int index = -1;
        for (int i = 1; i <=node ; i++) {
            if(!mst[i] && (index == -1 || minimumWt[index] > minimumWt[i])){
                index = i;
            }

        }
        return index;
    }
}