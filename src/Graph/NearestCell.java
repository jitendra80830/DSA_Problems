package Graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NearestCell {
    static class Graph {
        private int numberNode;
        private ArrayList<ArrayList<Integer>> adj;
        private boolean visited[];

        Graph(int vertex) {
            numberNode = vertex;
            adj = new ArrayList();
            visited = new boolean[vertex];
            for (int i = 0; i < vertex; i++) {
                adj.add(i, new ArrayList());
            }
        }

        public void addEdge(int start, int end) {
            adj.get(start).add(end);
            adj.get(end).add(start);
        }



        public void bfs(int n) {
            Queue<Integer> q = new LinkedList();

            visited[n] = true;
            q.add(n);
            int count = 0;
            while (!q.isEmpty()) {
                int node1 = q.remove();
                //System.out.print(node1 + " ");
                ArrayList<Integer> node2 = adj.get(node1);
                for (Integer node : node2) {
                    visited[node] = true;
                    if(node == 1){
                        q.add(node);
                        count++;
                    }
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int E = sc.nextInt();
            Graph g = new Graph(N);
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                g.addEdge(u, v);
            }
            g.bfs(0);
        }
    }
}
