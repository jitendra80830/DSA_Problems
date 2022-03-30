package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BipartiteGraph {
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
        int color[]  = new int[100005];
        Arrays.fill(color , -1);
        if(bipartite(arr , color , 0 ,nodes)){
            System.out.print("Graph is Bypartite");
        }else {
            System.out.print("Graph is not Bypartite");
        }

    }

    private static boolean bipartite(int[][] arr, int[] color, int root, int nodes) {
        color[root] = 1; // add 0 index value in color for making colored
        Queue<Integer> q = new LinkedList<>();
        q.add(root);// and add in queue
        while (!q.isEmpty()){ // while queue if not empty
            int u = q.poll(); // store peek element in u and remove from q
            for (int v = 0; v < nodes; v++) {
                if(arr[u][v] == 1){ // if addject hai
                    if(color[v] == -1){ // and not any color
                        color[v] = 1-color[u]; // make color with 0 0r 1
                        q.add(v); // and v addjent add in q
                    }else if(color[v] == color[u]){ // and if both element is same color menas adjecent element also same color present then not bypartite
                        return false;
                    }
                }

            }
        }
        // if above codition not matched means bypartite hai
        return true;

    }
}
