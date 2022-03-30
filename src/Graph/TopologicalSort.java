package Graph;

import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
    static Stack<Integer> st;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        int arr[][]= new int[nodes][nodes];
        for (int i = 0; i <edges ; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
        }
        st = new Stack<>();
        int visited[] = new int[100005];
        for (int i = 0; i <nodes ; i++) {
            if(visited[i] == 0){
                topologicalSort(arr ,nodes , i , visited);
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    private static void topologicalSort(int[][] arr, int nodes, int u, int[] visited) {
        visited[u] = 1; // making visited u
        for (int i = 0; i < nodes; i++) { // till nodes
            // if addj element hai and not visited hai then call
            if(arr[u][i] == 1 && visited[i] == 0){
                topologicalSort(arr , nodes , i,visited);
            }
        }
        st.push(u);

    }
}
