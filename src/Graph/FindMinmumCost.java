package Graph;

import java.util.*;
import java.io.*;
public class FindMinmumCost {
    static class Graph {
        private int V; // No. of vertices in graph.
        private LinkedList<Integer>[] adj; // Adjacency List
        // representation
        ArrayList<ArrayList<Integer> > components
                = new ArrayList<>();
        @SuppressWarnings("unchecked") Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adj[i] = new LinkedList();
        }
        void addEdge(int u, int w)
        {
            adj[u].add(w);
            adj[w].add(u); // Undirected Graph.
        }
        void DFSUtil(int v, boolean[] visited,
                     ArrayList<Integer> al)
        {
            visited[v] = true;
            al.add(v);
            //System.out.print(v + " ");
            Iterator<Integer> it = adj[v].iterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n])
                    DFSUtil(n, visited, al);
            }
        }
        void DFS()
        {
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                ArrayList<Integer> al = new ArrayList<>();
                if (!visited[i]) {
                    DFSUtil(i, visited, al);
                    components.add(al);
                }
            }
        }
        int ConnectedComponents() {

            return components.size();
        }
    }
    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Graph g=new Graph(n);
        for(int i=0;i<m;i++){
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            g.addEdge(u,v);
        }
        g.DFS();
        System.out.println(g.ConnectedComponents()-1);
    }
}