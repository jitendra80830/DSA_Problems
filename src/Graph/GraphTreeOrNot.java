package Graph;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphTreeOrNot {
    static class Graph
    {
        public   int V; // No. of vertices
        public static  LinkedList<Integer> adj[]; //Adjacency List
        Graph(int v)
        {
            V = v;
            adj = new LinkedList[V];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList<Integer>();
        }
        // Function to add an edge into the graph
        void addEdge(int v,int w)
        {
            adj[v].add(w);
            adj[w].add(v);
        }
        // A recursive function that uses visited[] and parent
        // to detect cycle in subgraph reachable from vertex v.
        static  boolean isCyclicUtil(int v, boolean visited[], int parent)
        {
            // Mark the current node as visited
            visited[v] = true;
            Integer i;
            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> it = adj[v].iterator();
            while (it.hasNext())
            {
                i = it.next();
                // If an adjacent is not visited, then recur for
                // that adjacent
                if (!visited[i])
                {
                    if (isCyclicUtil(i, visited, v))
                        return true;
                }
                // If an adjacent is visited and not parent of
                // current vertex, then there is a cycle.
                else if (i != parent)
                    return true;
            }
            return false;
        }
        // Returns true if the graph is a tree, else false.
        boolean isTree()
        {
            // Mark all the vertices as not visited and not part
            // of recursion stack
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++)
                visited[i] = false;
            // The call to isCyclicUtil serves multiple purposes
            // It returns true if graph reachable from vertex 0
            // is cyclcic. It also marks all vertices reachable
            // from 0.
            if (isCyclicUtil(0, visited, -1))
                return false;
            // If we find a vertex which is not reachable from 0
            // (not marked by isCyclicUtil(), then we return false
            for (int u = 0; u < V; u++)
                if (!visited[u])
                    return false;
            return true;
        }}
    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int e=sc.nextInt();
            Graph g1=new Graph(n);
            for(int i=0;i<e;i++){
                int u=sc.nextInt();
                int v=sc.nextInt();
                g1.addEdge(u,v);
            }
            if(g1.isTree())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}